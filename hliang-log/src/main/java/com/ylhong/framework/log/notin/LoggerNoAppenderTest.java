package com.ylhong.framework.log.notin;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ylhong
 * @date 2021/12/29
 */
public class LoggerNoAppenderTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testNoAppender() {
        logger.info( "hello world" );
    }

}
