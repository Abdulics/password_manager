package com.dulTek.passManager;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.dulTek.passManager.model.User;
import com.dulTek.passManager.service.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase
@Rollback(false)
public class UserReporsiotoryTest {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setFirstName("Aliah");
		user.setLastName("Abdul");
		user.setEmail("Aliah@dultek.com");
		user.setUsername("aabdul");
		user.setPassword("aliahpass");
		User savedUser = repo.save(user);
		User existUser = entityManager.find(User.class, savedUser.getId());
		assert(existUser.getEmail()).isEqualTo(user.getEmail());
	}
}
