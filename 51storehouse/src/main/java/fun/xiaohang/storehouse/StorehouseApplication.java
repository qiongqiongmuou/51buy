package fun.xiaohang.storehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StorehouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorehouseApplication.class, args);
    }
}
