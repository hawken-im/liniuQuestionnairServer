package com.ikun.liliu.test;

import com.ikun.liliu.util.MD5;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author shaxiao
 * @ymd 20241207(星期六)
 * @time 0:52
 * @saysome : 测试
 */
@RestController
@RequestMapping("/test")
@Slf4j
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

    @GetMapping("/hi")
    public Object hi(@RequestParam(name = "name") String name)
    {
        return MD5.md5(name);
    }

    @Data
    private static class TestEcho
    {
        private long millis;
        private Object o;
    }

}
