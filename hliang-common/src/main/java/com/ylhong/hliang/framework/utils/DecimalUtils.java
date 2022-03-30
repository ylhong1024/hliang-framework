package com.ylhong.hliang.framework.utils;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author ylhong
 * @date 2021/10/21
 */
public class DecimalUtils {

    /******************************************
     ****           arithmetic calc        ****
     *****************************************/

    /**
     * 除法。 保留两位小数，四舍五入
     */
    public static BigDecimal div( BigDecimal divisor, BigDecimal dividend) {
        return div(divisor, dividend, 2);
    }

    /**
     * 除法，根据scale调整精度并四舍五入
     */
    public static BigDecimal div(BigDecimal divisor, BigDecimal dividend, int scale) {
        if (divisor == null || dividend == null) {
            return null;
        }
        return NumberUtil.div( divisor, dividend, scale, RoundingMode.HALF_UP );
    }

    /******************************************
     ****         arithmetic convert       ****
     *****************************************/
    /**
     * 分转元，保留2位小数并四舍五入，默认返回null
     */
    public static BigDecimal cent2Yuan(BigDecimal num) {
        return cent2YuanOrDefault( num, null, 2 );
    }
    public static BigDecimal cent2Yuan(BigDecimal num, int scale) {
        return cent2YuanOrDefault( num, null, scale );
    }
    /**
     * 分转元，保留两位小数（四舍五入）
     */
    public static BigDecimal cent2YuanOrDefault(BigDecimal num, BigDecimal defaultValue) {
        return cent2YuanOrDefault( num, defaultValue, 2 );
    }

    /**
     * 分转元，根据scale调整精度并四舍五入
     */
    public static BigDecimal cent2YuanOrDefault(BigDecimal num, BigDecimal defaultValue, int scale) {
        BigDecimal result = null;
        if (num != null) {
            result = div( num, BigDecimal.valueOf( 100 ), scale );
        }
        if (result == null && defaultValue != null) {
            result = defaultValue;
        }
        return result;
    }

    /**
     * 元转分；如果入参为null，默认为0
     */
    public static BigDecimal yuan2Cent(BigDecimal num) {
        return yuan2CentOrDefault(num, null);
    }
    /**
     * 元转分
     */
    public static BigDecimal yuan2CentOrDefault(BigDecimal num, BigDecimal defaultValue) {
        BigDecimal result = null;
        if (num != null) {
            result = NumberUtil.mul( num, 100 );
        }
        if (result == null && defaultValue != null) {
            result = defaultValue;
        }
        return result;
    }


}
