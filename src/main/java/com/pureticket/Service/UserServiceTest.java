package com.pureticket.Service;


import com.pureticket.DTO.UserFormDTO;
import com.pureticket.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application.yml")
class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser() {
        UserFormDTO userFormDto = new UserFormDTO();
        userFormDto.setUser_id("test");
        userFormDto.setUser_email("test@email.com");
        userFormDto.setUser_name("홍길동");
        userFormDto.setUser_phone("010-1111-2222");
        userFormDto.setUser_pass("0000");
        //userFormDto.setUser_birth(2001.01.02);
        return User.createUser(userFormDto,passwordEncoder); //책156p.
    }

  //*
    @Test
    @DisplayName("회원가입테스트")
    public void saveUserTest() {
        User user = createUser();
        User savedUser = userService.saveUser(user);

        assertEquals(user.getUser_id(),savedUser.getUser_id());
        assertEquals(user.getUser_pass(),savedUser.getUser_pass());
        assertEquals(user.getUser_name(),savedUser.getUser_name());
        assertEquals(user.getUser_email(),savedUser.getUser_email());
        assertEquals(user.getUser_birth(),savedUser.getUser_birth());
    }

   /**/

    /*
    @Test
    @DisplayName("중복 회원 가입 테스트")
    public void saveDuplicateMemberTest() {
        User user1=createUser();
        User user2=createUser();
        userService.saveUser(user1);

        Throwable e=assertThrows(IllegalStateException.class, () -> {
            userService.saveUser(user2);});

        assertEquals("이미 가입된 회원입니다.", e.getMessage());
    }

     /**/
}
