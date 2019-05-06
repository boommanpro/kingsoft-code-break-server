package cn.boommanpro.kingsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KingsoftCodeBreakServerApplication {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.boommanpro.codebreak.cache.TrainImageCache");
        SpringApplication.run(KingsoftCodeBreakServerApplication.class, args);
    }

}
