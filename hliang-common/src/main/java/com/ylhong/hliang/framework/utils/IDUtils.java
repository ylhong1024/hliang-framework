package com.ylhong.hliang.framework.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * id生成器
 *
 * @author ylhong
 * @date 2021/10/21
 */
public class IDUtils {

    private final static Snowflake SNOWFLAKE;

    static {
        final String localhostStr = NetUtil.getLocalhostStr();
        SNOWFLAKE = IdUtil.getSnowflake( StringUtils.isBlank( localhostStr ) ? RandomUtils.nextInt( 0, 1 << 5 ) :
                Long.parseLong( localhostStr.replaceAll( "\\.", "" ) ) % ( 1 << 5 )
        );
    }

    public static String genSnowflakeId(){
        return String.valueOf( SNOWFLAKE.nextId() );
    }

    public static String getSimpleUuid() {
        return IdUtil.simpleUUID();
    }

    public static String getFastSimpleUuid() {
        return IdUtil.fastSimpleUUID();
    }

}
