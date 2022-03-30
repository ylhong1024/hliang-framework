package com.ylhong.framework.log;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用日志的标配是即需要日志门面 + 日志实现。
 * 主流的日志门面是使用： slf4j
 * 主流的日志实现是： logback, log4j, log4j2
 *
 * 主流的搭配是： slf4j + logback
 *
 * @author ylhong
 * @date 2021/12/29
 */
public class NormalLogTest {

    private static final Logger logger = LoggerFactory.getLogger( NormalLogTest.class );

    @Test
    public void testLog01() {
        logger.info( "hello world" );
    }

}
