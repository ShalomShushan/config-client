package com.config.server.learning.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class will read the configurations from the config server,
 * which, in turn, reads the values from the configuration repo on GitHub.
 * I think the "application" in the annotation, is the prefix for the variables in the config repo.
 * So on the config repo, there will be a file [app-name]-[env].properties (i.e config-client-dev.properties),
 * and in it `application.message=value`
 */
@Component
@ConfigurationProperties("application")
public class ApplicationConfiguration {

    // So far only have one configuration value.
    private String message;

    // I could use lombok I guess.
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
