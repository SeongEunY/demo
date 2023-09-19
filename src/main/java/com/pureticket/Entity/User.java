package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
// import com.example.demo.UserFormDto;
//import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@Entity

public class User {


    @Id //회원번호
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="user_id") //회원아이디
    private String user_id;

    @Column(name="user_name") //회원이름
    private String user_name;

    @Column(name="user_pass") //회원비밀번호
    private String user_pass;

    @Column(name="user_email") //회원 이메일
    private String user_email;

    @Column(name="user_birth") //회원 생년월일
    private Date user_birth;

    @Column(name="user_phone") //회원 전화번호
    private String user_phone;

    @Column(name="sub_date") //가입날짜
    private LocalDate sub_date;

    @OneToMany(mappedBy = "Pay") //결제번호
    private ArrayList<Pay> pay_num = new ArrayList<Pay>();

    @OneToMany(mappedBy = "Qna") //문의 번호
    private ArrayList<Qna> qna_num = new ArrayList<Qna>();

    @OneToMany(mappedBy = "ResvHistory") //예매번호
    private ArrayList<ResvHistory> resv_num=new ArrayList<ResvHistory>();

    @OneToMany(mappedBy = "ResvCancel") //취소번호
    private ArrayList<ResvCancel> cancel_num=new ArrayList<ResvCancel>();

   /* public static User createUser(UserFormDto userFormDto, PasswordEncoder passwordEncoder) {

        User user = new User();
        user.set
    }*/
}
