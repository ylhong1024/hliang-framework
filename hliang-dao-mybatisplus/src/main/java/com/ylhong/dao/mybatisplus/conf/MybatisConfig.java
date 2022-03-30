package com.ylhong.dao.mybatisplus.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ylhong
 * @date 2022/3/30
 */
@Configuration
@MapperScan("com.ylhong.dao.**.mapper")
public class MybatisConfig {

}
