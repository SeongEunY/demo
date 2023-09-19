package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class Pay {

    @Id //결제 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pay_num;

    @Column(name="pay_price") //결제 금액
    private Integer pay_price;

    @Column(name="pay_method") //결제방법
    private String pay_method;

    @Column(name="pay_date") //결제일
    private Date pay_date;

    @Column(name="pay_state") //결제상태
    private String pay_state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id") //회원번호
    private User id;


}
