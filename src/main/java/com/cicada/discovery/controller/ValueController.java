package com.cicada.discovery.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ValueController
{
    @Value("${test}")
    private String value;

    @GetMapping("property")
    public String getValue()
    {
        return value;
    }
}
