package com.sys.bio.back.models.packaging;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sys.bio.back.models.order.Order;
import com.sys.bio.back.models.packaging.Packaging;
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
@Table(name="boxTypes")

public class BoxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boxTypeId;
    private String name;
    private String provider;
    private String format;
    private Integer strawAmount;
    private String description;
    private Boolean enabled;
    @OneToMany(mappedBy = "boxType", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Package> packages = new LinkedHashSet<>();
    @OneToMany(mappedBy = "boxType", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Order> orders = new LinkedHashSet<>();


}
