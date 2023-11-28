package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;

@ConfigurationProperties(prefix="demo")
@Validated
public record DemoProperties(@NotNull String thing) {

}
