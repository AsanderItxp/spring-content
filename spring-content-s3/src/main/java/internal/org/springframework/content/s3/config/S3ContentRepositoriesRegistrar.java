package internal.org.springframework.content.s3.config;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.content.commons.config.AbstractContentStoreBeanDefinitionRegistrar;
import org.springframework.content.s3.config.EnableS3ContentRepositories;

public class S3ContentRepositoriesRegistrar extends AbstractContentStoreBeanDefinitionRegistrar {

	@Override
	protected void createOperationsBean(BeanDefinitionRegistry registry) {
	}

	@Override
	protected Class<? extends Annotation> getAnnotation() {
		return EnableS3ContentRepositories.class;
	}
}
