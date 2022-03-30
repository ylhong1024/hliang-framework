package com.ylhong.hliang.framework.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author ylhong
 * @date 2021/10/21
 */
public class JsonUtils {

    /**
     * bean转json，忽略null和空串，并且可指定忽略的成员变量
     */
    public static String bean2JsonIgnoreNullSorted(Object obj, String... ignore) {
        if (obj == null) {
            return null;
        }
        Set<String> setIgnore = new HashSet<>( CollectionUtil.toList( ignore ) );

        final Map<String, Object> mapObj = BeanUtil.beanToMap( obj );
        final Iterator<Map.Entry<String, Object>> it = mapObj.entrySet().iterator();
        Map<String, Object> treeMap = new TreeMap<>();
        while (it.hasNext()) {
            final Map.Entry<String, Object> entry = it.next();
            if (setIgnore.contains( entry.getKey() )) {
                continue;
            }
            if (entry.getValue() == null) {
                continue;
            }
            if (entry.getValue() instanceof String && StringUtils.isBlank( entry.getValue().toString() )) {
                continue;
            }
            treeMap.put( entry.getKey(), entry.getValue() );
        }
        return new JSONObject( treeMap ).toString();
    }

}
