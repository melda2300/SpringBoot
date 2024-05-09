package springBoot.service;

import springBoot.dto.User;
public interface UserService {
    User getUserById(long userId);
}
