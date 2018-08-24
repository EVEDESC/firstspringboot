package com.shaominghao.fspringboot.mapper;

import com.shaominghao.fspringboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
* @Description:    DAO接口层
* @Author:         ShaoMingHao
* @CreateDate:     2018/8/24 14:29
* @UpdateUser:     ShaoMingHao
* @UpdateDate:     2018/8/24 14:29
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@Repository
public interface UserMapper {
    
    @Select("select * from users where userId = #{userId}")
    User findUserByUserid(@Param("userId") String userId);

    @Insert("insert into users (userId,pwd) values (#{userId},#{pwd})")
    boolean insertUsers (@Param("userId") String userId,@Param("pwd") String pwd);
}
