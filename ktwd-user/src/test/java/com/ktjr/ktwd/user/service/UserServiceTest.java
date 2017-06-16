package com.ktjr.ktwd.user.service;

/**
 * @author vincentchen
 * @date 17/6/11.
 */

import com.ktjr.ktwd.user.domain.User;
import com.ktjr.ktwd.user.repository.HobbyRepository;
import com.ktjr.ktwd.user.repository.UserRepository;
import com.ktjr.ktwd.user.service.Impl.UserServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
public class UserServiceTest {

    @TestConfiguration
    static class UserServiceImplTestContextConfiguration {

        @Bean
        public UserService userService() {
            return new UserServiceImp();
        }
    }

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @MockBean
    private HobbyRepository hobbyRepository;

    @Test
    public void testGetUserByName() {

        String name = "Alex";

        User alex = new User("alex@163.com", name, 30);
        Mockito.when(userService.getUserByName(alex.getName()))
                .thenReturn(alex);
        User found = userService.getUserByName(name);

        assertThat(found.getName()).isEqualTo(name);
    }
}
