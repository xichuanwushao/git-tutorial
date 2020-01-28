package org.xichuan.dao2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xichuan.model.User;

/**
 * Created by sang on 2018/7/16.
 */
public interface UserDao2 extends JpaRepository<User,Integer> {
}
