package com.sys.bio.back.models.sized;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "maintenances")
public class Maintenance {

    @Id
    private Long maintenanceId;
    private Date date;
    private LocalTime hour;
    private String reason;
    private String state;
    private String operator;
}
