package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    //username 중복확인
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }

    //회원가입
    public void signup(SignupReqDto signupReqDto) {
        //1. signupReqDto -> user (entity)
        User user = signupReqDto.toEntity();
        //2. userId 생성
        //3. user 배열에 추가
    }
}
