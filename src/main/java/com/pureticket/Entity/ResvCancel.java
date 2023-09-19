package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

public class ResvCancel {

    @Id //취소번호
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cancel_num;

    @OneToOne(mappedBy = "Pay") //결제번호
    private Pay pay_num;

    @OneToOne(mappedBy="ResvHistory") //예매번호
    private ResvHistory resv_num;


    @Column (name="cancel_money") //환불금액
    private Integer cancel_money;


    //@OneToMany(mappedBy = "User")
    //private ArrayList<User> id=new ArrayList<User>();
}
