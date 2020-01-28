package org.xichuan.dao1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xichuan.model.User;

/**
 * Created by sang on 2018/7/16.
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
