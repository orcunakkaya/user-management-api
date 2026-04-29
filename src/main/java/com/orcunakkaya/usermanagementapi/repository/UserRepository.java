package com.orcunakkaya.usermanagementapi.repository;

import com.orcunakkaya.usermanagementapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
