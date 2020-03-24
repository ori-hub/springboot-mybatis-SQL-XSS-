package com.ori.template.mapper;

import com.ori.template.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    List<User> queryUserList();
}
