package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Qna {

    @Id //문의 번호
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer qna_number;

    @Column (name="qna_title") //문의제목
    private String qna_title;

    @Column(name="qna_content") //문의 내용
    private String qna_content;

    @Column (name="qna_date") //문의 작성날짜
    private Date qna_date;

    @OneToOne(mappedBy = "Answer") //답변 번호
    private Answer answer_num;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id") //회원번호
    private User id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="resv_num") //예매 번호
    private ResvHistory resv_num;




}
