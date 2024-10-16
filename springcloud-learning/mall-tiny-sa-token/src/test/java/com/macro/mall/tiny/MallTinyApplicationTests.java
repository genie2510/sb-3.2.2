package com.macro.mall.tiny;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class MallTinyApplicationTests {
    @Autowired
    private PmsBrandService pmsBrandService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testMethod() {
        List<PmsBrand> brandList = pmsBrandService.listAllBrand();
        log.info("testMethod:{}", brandList);
    }

}
