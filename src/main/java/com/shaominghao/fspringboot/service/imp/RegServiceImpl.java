package com.shaominghao.fspringboot.service.imp;

import com.shaominghao.fspringboot.mapper.UserMapper;
import com.shaominghao.fspringboot.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Description:    实现
* @Author:         ShaoMingHao
* @CreateDate:     2018/8/24 14:13
* @UpdateUser:     ShaoMingHao
* @UpdateDate:     2018/8/24 14:13
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@Service
public class RegServiceImpl implements IRegService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean regUser(String uerId, String pwd) {

        Boolean flag;
        try {
            flag = userMapper.insertUsers(uerId,pwd);
        }catch (Exception e){
            return false;
        }
        return flag.booleanValue();
    }

}
