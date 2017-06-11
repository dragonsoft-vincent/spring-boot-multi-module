package com.ktjr.ktwd.core.service;

import com.google.common.collect.Lists;
import com.ktjr.ktwd.core.repository.UserRepository;
import com.ktjr.ktwd.core.service.Impl.UserServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserServiceImp service;


    @Before
    public void initialize() {
        initMocks(this);
    }


    @Test
    public void find() {
        String name = "vincent";
        service.getUserByName(name);
        verify(repository).findByName(Lists.newArrayList("vincent"));
    }
}
