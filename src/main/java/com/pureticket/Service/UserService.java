package com.pureticket.Service;

import com.pureticket.Entity.User;
import com.pureticket.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        validateDuplicateUser(user);
        return userRepository.save(user);
    }

    private void validateDuplicateUser(User user){
        User findUser = userRepository.findByUser_id(user.getUser_id());
        if(findUser != null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }
}
