package com.pureticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

public class Genre {

    @Id //장르번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genre_num;

    @Enumerated(EnumType.STRING) //(콘서트, 뮤지컬, 연극, 전시, 행사, 스포츠)
    private Genre genre;
}
