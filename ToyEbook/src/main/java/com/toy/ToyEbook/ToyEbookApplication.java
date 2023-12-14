package com.toy.ToyEbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.toy.ToyEbook.**.mapper")
public class ToyEbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyEbookApplication.class, args);
	}

}
