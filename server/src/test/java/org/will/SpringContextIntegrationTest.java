package org.will;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.will.spring.cloud.config.server.ConfigServer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConfigServer.class)
@WebAppConfiguration
public class SpringContextIntegrationTest {
    @Test
    public void contextLoads() {
    }
}
