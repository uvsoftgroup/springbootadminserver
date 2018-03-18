package uvsoftgroup.springbootadminserver.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import uvsoftgroup.springbootadminserver.model.User;
import uvsoftgroup.springbootadminserver.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

private UserRepository userRepository;

public UserServiceImpl(UserRepository userRepository) {
	super();
	this.userRepository = userRepository;
}

/*
 * (non-Javadoc)
 * @see uvsoftgroup.springbootadminserver.service.UserService#save(uvsoftgroup.springbootadminserver.model.User)
 */
public User save(User user) {
	
 User savedUser=userRepository.save(user);
 if(savedUser!=null){
	 return  savedUser;
 }
 else{
	 return new User();
 }
}

/*
 * (non-Javadoc)
 * @see uvsoftgroup.springbootadminserver.service.UserService#findAll()
 */
public List<User> findAll() {
	List<User> list=userRepository.findAll();
	if(!list.isEmpty()){
		return list;
	}
	else{
		return new ArrayList<User>(list);
	}
    
}
/*
 * (non-Javadoc)
 * @see uvsoftgroup.springbootadminserver.service.UserService#findById(java.lang.Long)
 */
public User findById(Long id) {
	User userValue=userRepository.findOne(id);
	if(userValue!=null){
		return userValue;
	}
	else{
		 return new User();
	}
    
}
/*
 * (non-Javadoc)
 * @see uvsoftgroup.springbootadminserver.service.UserService#delete(java.lang.Long)
 */
public String delete(Long id) {
	
	 User user = userRepository.findOne(id);
	 
	 if(user!=null && user.getId()!=null){
		 userRepository.delete(user);
		 return String.format("Successful:Id is deleted:%s",user.getId());
		}
		else{
			return String.format("Fail:Id is not exist:%s",user.getId());
		}
}
/*
 * (non-Javadoc)
 * @see uvsoftgroup.springbootadminserver.service.UserService#update(java.lang.Long, uvsoftgroup.springbootadminserver.model.User)
 */
public User update(Long id,User userUpdate) {
	
	User user = userRepository.findOne(id);
	
	if(user!=null && user.getId()!=null){
		user.setUsername(userUpdate.getUsername());
		user.setPassword(userUpdate.getPassword());
		user.setRoles(userUpdate.getRoles());
		return userRepository.save(user);
	}
	else{
		return new User();
	}
  }

}
