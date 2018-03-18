/**
 * 
 */
package uvsoftgroup.springbootadminserver.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springbootadminserver.model.UserRegistration;

@RepositoryRestResource(collectionResourceRel = "userRegistrationResource", path = "userRegistrationResource")
public interface UserRegistrationRepository extends PagingAndSortingRepository<UserRegistration,Long> {

}
