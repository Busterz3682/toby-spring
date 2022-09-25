package springbook.user.dao;

import java.sql.SQLException;

import springbook.user.domain.User;

public class UserDaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		NUserDao dao = new NUserDao();
		
		User user = new User();
		user.setId("ntestid");
		user.setName("ntestnamen");
		user.setPassword("ntestpassword");
		
		dao.add(user);
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
		
	}

}
