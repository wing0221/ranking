
package com.springproject01.demo.web.ranking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/ranking")
@RequiredArgsConstructor
public class RankingContoller {

    @GetMapping("/{user_id}/new")
    public String UserNew(@ModelAttribute RankingForm rankingForm) {
        return "/ranking/new";
    }
    
    @PostMapping
    public String UserCreate(@Validated RankingForm rankingForm, BindingResult error, Model model) {
        if (error.hasErrors()) {
            return UserNew(userForm);
        } else {
            userService.create(userForm.getLogin_id(),
                               userForm.getUser_name(), 
                               userForm.getEmail(),
                               userForm.getPassword());
            return "redirect:/";
        }
    }
}
