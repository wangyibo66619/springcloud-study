package com.wang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule wangRule() {
        return new WangRule(); // 默认是轮询，现在我们定义为 WangRule
    }
}
