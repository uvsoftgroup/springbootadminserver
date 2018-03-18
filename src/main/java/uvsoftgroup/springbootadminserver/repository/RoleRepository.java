package uvsoftgroup.springbootadminserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uvsoftgroup.springbootadminserver.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
