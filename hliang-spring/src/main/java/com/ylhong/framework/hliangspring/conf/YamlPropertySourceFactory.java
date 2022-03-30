package com.ylhong.framework.hliangspring.conf;

import cn.hutool.core.lang.Assert;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;

/**
 * @author ylhong
 * @date 2021/12/23
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource( String name, EncodedResource resource ) throws IOException {
        String sourceName = name == null ? resource.getResource().getFilename() : name;
        Assert.isTrue( StringUtils.endsWithAny( sourceName, "yaml", "yml" ), "file name[{}] suffix must be yaml or yml", sourceName );
        Assert.isTrue( resource.getResource().exists(), "resource[{}] is not exist", resource.getResource().getFilename() );

        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources( resource.getResource() );
        factoryBean.afterPropertiesSet();
        return new PropertiesPropertySource(sourceName, factoryBean.getObject());
    }

}
