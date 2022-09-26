package springbook.user.dao;

public class DaoFactory {

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
	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
	
}
