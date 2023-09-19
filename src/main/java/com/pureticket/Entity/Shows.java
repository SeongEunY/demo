package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Entity

public class Shows { //공연

    @Id //공연번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer show_num;

    @Column(name="공연이름")
    private String show_name;

    @Column(name="공연장소")
    private String show_ven;

    @Column(name="공연 캐스팅 정보")
    private String show_cast;

    @Column(name="공연 기간")
    private Date show_period;

    @Column(name="공연 상영 시간")
    private String show_running_time;

    @Column(name="공연 관람 연령 등급")
    private String show_grade;

    //@Column(name="show_banner")
    //private String show_banner;

    //@Column(name="show_banner_size")
    //private String show_banner_size;


    @Column (name="schedule_time") //공연시작시간
    private String schedule_time;

    @Column(name="show_date") //공연날짜
    private Date show_date;


    @OneToOne(mappedBy = "Genre") //장르
    private Genre genre_num;

    @OneToMany(mappedBy = "SeatGrade") //좌석등급 가격
    private ArrayList<SeatGrade> grade_price=new ArrayList<SeatGrade>();

}
