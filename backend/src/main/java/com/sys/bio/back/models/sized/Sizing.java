package com.sys.bio.back.models.sized;

import com.sys.bio.back.models.user.Responsible;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sizings")
public class Sizing {

    @Id
    private Long sizingId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Responsible responsible;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Double totalHours;
    private String observations;
}
