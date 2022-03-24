package com.greedy.sangbum.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value="com.greedy.sangbum", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
