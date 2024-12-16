package com.ikun.liliu.util;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author shaxiao
 * @ymd 20241215(星期日)
 * @time 23:17
 * @saysome :
 */
@Component
@Slf4j
public class MD5
{
    @Value("${encrypt.md5.salt:shepi}")
    private String salt;

    private static String SALT = null;

    @PostConstruct
    public void init()
    {
        SALT = salt;
        log.info("MD5.salt={},MD5.SALT={}", salt, SALT);
    }


    public static String md5(String x)
    {
        x = String.join("", x, SALT);
        return DigestUtils.md5DigestAsHex(x.getBytes(StandardCharsets.UTF_8));
    }

    public static void main(String[] args)
    {
        System.out.println("md5=" + md5(""));
    }
}
