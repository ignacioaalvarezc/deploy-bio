package com.sys.bio.back.models.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cleaningTools")
public class CleaningTool {

    @Id
    private Long cleaningToolId;

    private String name;
    private Integer amount;
}
