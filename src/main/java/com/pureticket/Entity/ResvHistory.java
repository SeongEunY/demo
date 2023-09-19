package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class ResvHistory {  //예매내역

    @Id //예매번호
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer resv_num;

    @Column(name="resv_seat") //예매좌석
    private String resv_seat;

    @Column(name="resv_date") //예매날짜
    private Date resv_date;

    @Column(name="ticket_count") //티켓 구매 개수
    private int ticket_count;

    @Column(name="ticket_price") //티켓 가격
    private String ticket_price;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="id") //회원번호
    private User id;

    @OneToOne (mappedBy = "show_ven") //공연장소
    private Shows shows_ven;

    @OneToOne (mappedBy = "Shows") //공연이름
    private Shows shows_name;
    
    @OneToOne (mappedBy = "Pay") //결제일
    private Pay pay_date;
    
    @OneToOne (mappedBy = "Pay") //결제상태
    private Pay pay_stated;
}
