package com.jrx.tjp.oracle.jpa.repository;

import com.jrx.tjp.oracle.jpa.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
