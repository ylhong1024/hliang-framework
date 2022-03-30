package com.ylhong.dao.mybatisplus;

import com.ylhong.dao.mybatisplus.mapper.BsnMerchantMastMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ylhong
 * @date 2022/3/30
 */
@SpringBootTest
public class MybatisIntegrationTest {

    @Autowired
    private BsnMerchantMastMapper bsnMerchantMastMapper;

    @Test
    public void testDsInt() {
        System.out.println( bsnMerchantMastMapper.selectList( null ) );
    }

}
