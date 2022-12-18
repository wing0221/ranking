package com.springproject01.demo.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject01.demo.user.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("Users", userService.findAll());
        return "/user/list";
    }

    @GetMapping("/new")
    public String UserNew(@ModelAttribute UserForm userForm) {
        return "/user/new";
    }

    // UserFormを受け取る
    @PostMapping
    public String UserCreate(@Validated UserForm userForm, BindingResult error, Model model) {
        if (error.hasErrors()) {
            return UserNew(userForm);
        } else {
            userService.create(userForm.getLogin_id(), userForm.getUser_name(), userForm.getEmail(),
                    userForm.getPassword());
            return "redirect:/";
        }
    }

    // ユーザ詳細ページ表示
    @GetMapping("/{user_id}")
    public String showUserDetail(@PathVariable("user_id") int user_id, Model model) {
        // var dummyEntity = new UserEntity(2, "wing0000", "はるかそら", "000000",
        // "sora@example.com", "なし", "なし",
        // "2022-11-24 01:06:01", "2022-11-24 01:06:01");
        model.addAttribute("User", userService.findById(user_id));
        return "/user/detail";
    }
}
