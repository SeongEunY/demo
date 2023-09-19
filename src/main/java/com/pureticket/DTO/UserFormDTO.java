package com.pureticket.DTO;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter @Setter
public class UserFormDTO {

    //private Long id;

    private String user_id;

    @NotBlank (message="이름은 필수 입력 값입니다.")
    private String user_name;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Length(message ="비밀번호는 8자 이상, 20자 이하로 입력해주세요", min=8, max=20)
    private String user_pass;
    //private Date user_birth;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String user_email;

    @NotBlank(message = "전화번호는 필수 입력 값입니다.")
    private String user_phone;
}
