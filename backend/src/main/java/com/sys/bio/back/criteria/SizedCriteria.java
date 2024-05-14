package com.sys.bio.back.criteria;

import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LocalDateFilter;
import io.github.jhipster.service.filter.StringFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SizedCriteria {

    private StringFilter responsible;
    private StringFilter strawType;
    private DoubleFilter weight;
    private IntegerFilter amount;
    private LocalDateFilter filterDate;
}
