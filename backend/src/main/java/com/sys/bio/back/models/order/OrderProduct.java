package com.sys.bio.back.models.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sys.bio.back.models.order.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="orderProducts")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderProductId;
    private String name;
    private String provider;
    private String format;
    private Integer strawAmount;
    private String description;
    private Boolean enabled;
}
