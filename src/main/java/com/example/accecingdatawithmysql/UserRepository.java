package com.example.accecingdatawithmysql;

import org.springframework.data.repository.CrudRepository;
import com.example.accecingdatawithmysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
}
