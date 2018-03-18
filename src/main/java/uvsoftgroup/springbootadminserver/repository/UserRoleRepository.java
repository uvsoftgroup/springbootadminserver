package uvsoftgroup.springbootadminserver.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springbootadminserver.model.UserRole;

@RepositoryRestResource(collectionResourceRel = "userRoleResource", path = "userRoleResource")
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole, Long>{

}
