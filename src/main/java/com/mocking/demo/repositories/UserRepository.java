package com.mocking.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mocking.demo.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
