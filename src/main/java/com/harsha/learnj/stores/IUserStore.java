package com.harsha.learnj.stores;

import com.harsha.learnj.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserStore extends JpaRepository<User, Long> {
}
