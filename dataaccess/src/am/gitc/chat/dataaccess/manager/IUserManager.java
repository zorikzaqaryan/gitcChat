package am.gitc.chat.dataaccess.manager;

import am.gitc.chat.common.model.*;

public interface IUserManager {

	public void add(User user); // throws DatabaseException;

	public void edit(User user); //throws DataNotFoundException, DatabaseException;
}
