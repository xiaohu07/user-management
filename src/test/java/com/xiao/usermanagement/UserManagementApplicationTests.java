package com.xiao.usermanagement;

import static org.junit.jupiter.api.Assertions.*;

import com.xiao.usermanagement.entities.Role;
import com.xiao.usermanagement.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class UserManagementApplicationTests {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	void contextLoads() {
		User user = new User().setId("user001").setEmail("Test");
		assertEquals("user001", user.getId());
	}

	@Test
	void mongoTemplateSaveUser() {
		User user = new User().setId("user001").setEmail("Test").setPassword("password1");

		mongoTemplate.save(user, "user");
	}

	@Test
	void mongoTemplateSaveRole() {
		Role role = new Role().setName("Admin");
		mongoTemplate.save(role, "role");
	}

}
