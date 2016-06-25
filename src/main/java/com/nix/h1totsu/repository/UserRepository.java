package com.nix.h1totsu.repository;

import com.nix.h1totsu.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    //TODO Insert custom query methods
}
