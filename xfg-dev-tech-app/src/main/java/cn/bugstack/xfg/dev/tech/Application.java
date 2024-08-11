package cn.bugstack.xfg.dev.tech;

import cn.bugstack.xfg.dev.tech.infrastructure.dao.IUserOrderDao;
import cn.bugstack.xfg.dev.tech.infrastructure.po.UserOrderPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Slf4j
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
