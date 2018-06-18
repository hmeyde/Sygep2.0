package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.model.User;

public interface UserService {
    String signup(User user);
    public String signin(String username, String password);

}
