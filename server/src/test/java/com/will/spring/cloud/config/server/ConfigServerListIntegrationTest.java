package com.will.spring.cloud.config.server;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.will.spring.cloud.config.server.ConfigServer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConfigServer.class)
@WebAppConfiguration
@Ignore
public class ConfigServerListIntegrationTest {
    @Test
    public void contextLoads() {
    }
}
