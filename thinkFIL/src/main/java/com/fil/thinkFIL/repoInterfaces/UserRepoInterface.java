package com.fil.thinkFIL.repoInterfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fil.thinkFIL.dao.models.User;

@Repository
public interface UserRepoInterface extends CrudRepository<User, Integer> {
	public Optional<User> findByUserName(String username);
}
