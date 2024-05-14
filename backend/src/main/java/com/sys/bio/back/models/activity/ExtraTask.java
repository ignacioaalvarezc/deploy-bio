package com.sys.bio.back.models.activity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.sys.bio.back.models.user.Responsible;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "extraTasks")
public class ExtraTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long extraTaskId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("responsible")
    private Responsible responsible;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("activity")
    private Activity activity;

    private Date date;
    private LocalDate filterDate;
    private LocalTime startTaskTime;
    private LocalTime endTaskTime;
    private Double totalTaskHours;
}
