package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.UserData;
@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	public int createUser(UserData user) {
		return userdao.insertUser(user);
	}
}
