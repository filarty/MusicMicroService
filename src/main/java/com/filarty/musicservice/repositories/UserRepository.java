package com.filarty.musicservice.repositories;

import com.filarty.musicservice.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Long, User> {
}
