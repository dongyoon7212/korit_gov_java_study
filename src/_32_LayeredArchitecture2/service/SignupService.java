package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl2;

public class SignupService {
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (instance == null) {
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if (foundUser == null) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return password != null && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupReqDto signupReqDto) {
        userRepository.insert(signupReqDto.toEntity());
    }

}
