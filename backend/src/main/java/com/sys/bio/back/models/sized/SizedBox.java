package com.sys.bio.back.models.sized;

import com.sys.bio.back.models.user.Responsible;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sizedBoxes")
public class SizedBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sizedBoxId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Responsible responsible;
    @ManyToOne(fetch = FetchType.EAGER)
    private StrawType strawType;
    private Integer number;
    private Double weight;
    private Integer amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private LocalTime hour;
    private String observations;
    private LocalDate filterDate;
}
