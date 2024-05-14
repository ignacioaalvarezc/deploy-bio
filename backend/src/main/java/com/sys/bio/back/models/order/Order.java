package com.sys.bio.back.models.order;

import com.sys.bio.back.models.packaging.BoxType;
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
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long orderNumber;
    @ManyToOne(fetch = FetchType.EAGER)
    private BoxType boxType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pickUpDate;
    private LocalTime pickUpHour;
    private Integer packagesNumber;
    private Integer strawsNumber;
    private String  indications;
    private boolean enabled;
}
