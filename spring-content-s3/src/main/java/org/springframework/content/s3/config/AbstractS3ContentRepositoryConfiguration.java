package org.springframework.content.s3.config;

import org.springframework.cloud.aws.core.io.s3.SimpleStorageResourceLoader;
import org.springframework.context.annotation.Bean;

import com.amazonaws.regions.Region;

public abstract class AbstractS3ContentRepositoryConfiguration {

	@Bean
	public abstract Region region();
	
	@Bean
	public abstract String bucket();
	
	@Bean
	public abstract SimpleStorageResourceLoader simpleStorageResourceLoader();
}
