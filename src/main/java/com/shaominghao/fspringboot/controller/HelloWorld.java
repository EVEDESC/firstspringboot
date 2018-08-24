package com.shaominghao.fspringboot.controller;

import com.shaominghao.fspringboot.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
* @Description:    测试
* @Author:         ShaoMingHao
* @CreateDate:     2018/8/24 12:10
* @UpdateUser:     ShaoMingHao
* @UpdateDate:     2018/8/24 12:10
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class HelloWorld {
    @Autowired
    private IRegService regService;

    @RequestMapping("/")
    String home() {
        return "index";
    }
    @RequestMapping("/reg")
    @ResponseBody
    Boolean reg(@RequestParam("loginPwd") String loginNum, @RequestParam("userId") String userId ){
        String pwd = creatMD5(loginNum);
        System.out.println(userId+":"+loginNum);
        regService.regUser(userId,pwd);
        return true;
    }

    private String creatMD5(String loginNum){
        // 生成一个MD5加密计算摘要
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(loginNum.getBytes());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return new BigInteger(1, md.digest()).toString(16);
    }
}
