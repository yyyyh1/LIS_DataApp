package com.itscreen.dataentryapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itscreen.dataentryapp.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user order by id desc limit 0,1;")
    User queryLastUser();

    void save(User user);

    @Delete("DELETE FROM user order by id desc limit 1;")
    void deleteUser();
}
