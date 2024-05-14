package com.sys.bio.back.models.sized;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "strawtypes")
public class StrawType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long strawTypeId;
    private String name;
    private String description;
    @OneToMany(mappedBy = "strawType", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<SizedBox> sizedBoxes = new LinkedHashSet<>();
    private boolean enabled = true;

}
