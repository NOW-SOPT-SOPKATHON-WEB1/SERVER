package org.sopt.sopkathonweb1.repository;

import org.sopt.sopkathonweb1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
