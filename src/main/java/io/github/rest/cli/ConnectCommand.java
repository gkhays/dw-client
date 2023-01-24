package io.github.rest.cli;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.cli.EnvironmentCommand;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Environment;
import io.github.rest.BPlateClientConfiguration;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;

public class ConnectCommand extends EnvironmentCommand<BPlateClientConfiguration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectCommand.class);

    public ConnectCommand(Application<BPlateClientConfiguration> application, String name, String description) {
        super(application, name, description);
    }

    @Override
    public void configure(Subparser subparser) {
        // Configure the parent; otherwise it will not reconnize the config file.
        super.configure(subparser);
        subparser.addArgument("-u", "--url")
                .dest("url")
                .type(String.class)
                .required(true)
                .help("URL to which to connect");
        subparser.addArgument("-p", "--payload")
                .dest("payload")
                .type(String.class)
                .required(true)
                .help("Payload to send");
    }

    @Override
    protected void run(Environment environment, Namespace namespace, BPlateClientConfiguration configuration)
            throws Exception {
        String url = namespace.<String>get("url");
        String payload = namespace.<String>get("payload");

        LOGGER.info("Chunk encoding enabled: {}",
                configuration.getJerseyClientConfiguration().isChunkedEncodingEnabled());
        LOGGER.info("GZip enabled? {}", configuration.getJerseyClientConfiguration().isGzipEnabled());
        LOGGER.info("GZip enabled for requests? {}",
                configuration.getJerseyClientConfiguration().isGzipEnabledForRequests());

        // This is how to proggamatically disable chunked encoding and GZip.
        // configuration.getJerseyClientConfiguration().setChunkedEncodingEnabled(false);
        // configuration.getJerseyClientConfiguration().setGzipEnabled(false);
        // configuration.getJerseyClientConfiguration().setGzipEnabledForRequests(false);

        final JerseyClientBuilder clientBuilder = new JerseyClientBuilder(environment)
                .using(configuration.getJerseyClientConfiguration());
        final Client client = clientBuilder.build(getName());

        WebTarget target = client.target(url);
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE);
        Response response = builder.post(Entity.json(payload));
        LOGGER.info("Status: {}", response.getStatus());
        LOGGER.info("Status info: {}", response.getStatusInfo());
        LOGGER.debug("Processing entity: {}", response.getEntity());
        LOGGER.debug("Debug response: {}", response);
    }

}
