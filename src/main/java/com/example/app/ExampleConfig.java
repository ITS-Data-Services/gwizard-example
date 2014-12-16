package com.example.app;

import com.voodoodyne.gwizard.hibernate.DatabaseConfig;
import com.voodoodyne.gwizard.logging.LoggingConfig;
import com.voodoodyne.gwizard.web.WebConfig;
import lombok.Data;

/**
 */
@Data
public class ExampleConfig {
	private String foo;

	private LoggingConfig logging = new LoggingConfig();
	private WebConfig web = new WebConfig();
	private DatabaseConfig database = new DatabaseConfig();
}
