package com.study.apidemo.Springboot.study.database;

import com.study.apidemo.Springboot.study.models.Product;
import com.study.apidemo.Springboot.study.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//Class cos Configuration chua Bean method
//Bean method goi trong app khi app chay dung de khoi tao database, moi truong cho app
@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        //CommandLineRunner la 1 interface
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("Macbook pro 16 inch", 2020, 2400.0,"");
                Product productB = new Product("ipad air green", 2021, 599.0,"");
//                System.out.println("insert data: "+productRepository.save(productA));
//                System.out.println("insert data: "+productRepository.save(productB)); thay 2 dong nay bang logger.info
                logger.info("insert data: "+productRepository.save(productA));
                logger.info("insert data: "+productRepository.save(productB)); // dung de xem log

            }
        };
    }
}
