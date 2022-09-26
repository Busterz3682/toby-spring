package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
//	public AccountDao accountDao() {
//		return new AccountDao(connectionMaker());
//	}
//	
//	public MessageDao messageDao() {
//		return new MessageDao(connectionMaker());
//	}
	
	//�и��ؼ� �ߺ��� ������ ConnectionMaker Ÿ�� ������Ʈ ���� �ڵ�
	@Bean
	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
	
}