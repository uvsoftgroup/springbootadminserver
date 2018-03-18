package uvsoftgroup.springbootadminserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uvsoftgroup.springbootadminserver.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
