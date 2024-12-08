package com.ikun.liliu.test;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

/**
 * @author shaxiao
 * @ymd 20241207(星期六)
 * @time 0:52
 * @saysome : 测试
 */
@RestController
@RequestMapping("/test")
public class TestController
{

    @PostMapping("/echo")
    public TestEcho echo(@RequestBody Object o)
    {
        TestEcho echo=new TestEcho();
        echo.setMillis(System.currentTimeMillis());
        echo.setO(o);
        return echo;
    }



    @Data
    private static class TestEcho
    {
        private long millis;
        private Object o;
    }

}
