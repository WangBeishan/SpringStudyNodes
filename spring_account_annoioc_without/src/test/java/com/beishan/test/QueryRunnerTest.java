package com.beishan.test;

import config.JdbcConfig;
import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import java.sql.SQLOutput;

/**
 * 测试queryrunner是否单例
 */
public class QueryRunnerTest {

    @Test
    public void testQueryRunner() {
//        1.获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class, JdbcConfig.class);
//        2.获取queryRunner对象
        QueryRunner runner1 = ac.getBean("runner",QueryRunner.class);
        QueryRunner runner2 = ac.getBean("runner",QueryRunner.class);
        System.out.println(runner1 == runner2);

    }
}
