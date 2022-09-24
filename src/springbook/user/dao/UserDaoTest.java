package springbook.user.dao;

import java.sql.SQLException;

import springbook.user.domain.User;

public class UserDaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("testid2");
		user.setName("testname2");
		user.setPassword("testpassword2");
		
		dao.add(user);
		System.out.println(user.getId() + " ��� ����");
		
		User user2 = new User();
		dao.get(user.getId());
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " ��ȸ ����");
		
	}

}
