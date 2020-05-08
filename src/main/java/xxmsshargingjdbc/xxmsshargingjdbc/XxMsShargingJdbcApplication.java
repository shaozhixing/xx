package xxmsshargingjdbc.xxmsshargingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext-mybatis.xml")
public class XxMsShargingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxMsShargingJdbcApplication.class, args);
    }

}
