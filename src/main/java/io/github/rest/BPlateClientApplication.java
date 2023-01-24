package io.github.rest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.github.rest.cli.ConnectCommand;

public class BPlateClientApplication extends Application<BPlateClientConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BPlateClientApplication().run(args);
    }

    @Override
    public String getName() {
        return "BPlateClient";
    }

    @Override
    public void initialize(final Bootstrap<BPlateClientConfiguration> bootstrap) {
        bootstrap.addCommand(new ConnectCommand(this, "connect", "client connection"));
    }

    @Override
    public void run(final BPlateClientConfiguration configuration,
            final Environment environment) {
    }

}
