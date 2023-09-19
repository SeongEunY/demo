package com.pureticket.Repository;

import com.pureticket.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUser_id(String user_id);
}
