package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class Answer {

    @Id //답변 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answer_num;

    @Column(name="answer_title") //답변 제목
    private String answer_title;

    @Lob //답변 내용
    private byte[] answer_content;

    @Column(name="answer_date") //답변 날짜
    private Date answer_date;

    @Column (name="answer_state") //답변상태
    private String answer_state;

    @OneToOne(mappedBy = "Qna") //문의 번호
    private Qna qna_num;

}
