package cn.yanpeng.shijie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ShijieApplication
 * @Description 启动类
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("cn.yanpeng.shijie.mapper")
public class ShijieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShijieApplication.class, args);
    }

}
