package com.kusal.Fullstack.repositorry;

import com.kusal.Fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
