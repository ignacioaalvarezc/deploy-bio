package com.sys.bio.back.models.cutting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sys.bio.back.models.user.Responsible;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cutBoxes")
public class CutBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cutBoxId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("responsible")
    private Responsible responsible;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("cutting")
    private Cutting cutting;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("cutType")
    private CutType cutType;

    private Double weight;

    private Integer amount;

    private Date date;

    private LocalTime hour;

    private LocalDate filterDate;

}
