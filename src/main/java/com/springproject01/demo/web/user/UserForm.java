package com.springproject01.demo.web.user;

import java.util.Objects;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserForm {

    @Size(min = 6, max = 128, message = "ログインIDは6文字から128文字の間で入力してください。")
    private String login_id;

    @Size(min = 6, max = 128, message = "ユーザー名は6文字から128文字の間で入力してください。")
    private String user_name;

    @Pattern(regexp = "^([\\w])+([\\w\\._-])*\\@([\\w])+([\\w\\._-])*\\.([a-zA-Z])+$", message = "メールアドレスが正しくありません。")
    private String email;

    @Size(min = 6, max = 64, message = "パスワードは6文字から64文字の間で入力してください。")
    private String password;

    private String password_ready;

    // @AssertTrue(message = "パスワードが一致しません。")
    // public boolean isUnmatchedPasswordValid() {
    // System.out.println(password);
    // System.out.println(password_ready);
    // return password == password_ready;
    // }
}
