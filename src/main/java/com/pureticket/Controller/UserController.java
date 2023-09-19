package com.pureticket.Controller;

import com.pureticket.DTO.UserFormDTO;
import com.pureticket.Entity.User;
import com.pureticket.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
@RequiredArgsConstructor

/*
>>>>>>>>>>회원가입 후 메인페이지로 이동
public class MainController{
    @GetMapping(value="/")
    public String main(){
        return "main";
    }
}

 */
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping(value="/new")
    public String userForm(Model model) {
        model.addAttribute("userFormDto",new UserFormDTO());
        return "user/userForm";
    }

    @PostMapping(value="/new")
    public  String userForm(UserFormDTO userFormDTO){

        User user = User.createUser(userFormDTO,passwordEncoder);
        userService.saveUser(user);

        return  "redirect:/";
    }
}

////////////////////////////////166페이지부터 수정