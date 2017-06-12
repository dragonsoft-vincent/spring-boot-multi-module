package com.ktjr.ktwd.user.domain;

/**
 *
 * @author vincentchen
 * @date 17/6/11.
 */

import com.ktjr.ktwd.user.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testFindByEmail() {

        entityManager.persist(new User("test1@163.com", "Jack", 33));

        User user = userRepository.findByEmail("test1@163.com");
        assertEquals("Jack", user.getName());
        assertEquals(33, user.getAge());
    }

}
