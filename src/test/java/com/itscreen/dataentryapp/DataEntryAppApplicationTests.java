package com.itscreen.dataentryapp;

import com.itscreen.dataentryapp.entity.User;
import com.itscreen.dataentryapp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class DataEntryAppApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void testQueryLastUser(){
		User user = userMapper.queryLastUser();
		log.info(user.getName()+" "+ user.getTitle());
	}

	@Test
	void testAdd(){
		User user = new User();
		user.setName("Bob");
		user.setTitle("CEO");
		user.setAge(55);
		userMapper.save(user);
		User lastUser = userMapper.queryLastUser();
		log.info(lastUser.getName() + "     " + lastUser.getTitle());
	}


	@Test
	void testDel(){
		userMapper.deleteUser();

	}

}
