package com.shaominghao.fspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Description:    主类
* @Author:         ShaoMingHao
* @CreateDate:     2018/8/24 14:10
* @UpdateUser:     ShaoMingHao
* @UpdateDate:     2018/8/24 14:10
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@SpringBootApplication
@MapperScan("com.shaominghao.mapper")
public class FspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FspringbootApplication.class, args);
	}
}
