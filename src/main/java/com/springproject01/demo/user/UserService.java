package com.springproject01.demo.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public UserEntity findById(int user_id) {
        return userRepository.findById(user_id);
    }

    public void create(String login_id, String user_name, String email, String password) {
        // var encodedPassword = passwordEncoder.encode(password);// パスワードをエンコードする
        // userRepository.insert(username, encodedPassword);
        // TODO パスワードをハッシュ化
        userRepository.insert(login_id, user_name, email, password);
    }
}
