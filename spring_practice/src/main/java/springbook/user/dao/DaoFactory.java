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
	
	//분리해서 중복을 제거한 ConnectionMaker 타입 오브젝트 생성 코드
	@Bean
	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
	
}
