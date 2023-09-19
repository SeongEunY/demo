package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity

public class SeatGrade { //좌석 등급

    //PK로 해야되는지 모르겠음
    @Column (name="seat_grade") //좌석 등급
    private String seat_grade;

    @Column (name="grade_price") //등급별 가격
    private Integer grade_price;
}
