package uvsoftgroup.springbootadminserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uvsoftgroup.springbootadminserver.model.User;

@Service
public interface UserService {
	public User save(User user);
	public List<User> findAll();
	public User findById(Long id);
	public String delete(Long id);
	public User update(Long id,User userUpdate);

}
