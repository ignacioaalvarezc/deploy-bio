package com.sys.bio.back.models.packaging;

import com.sys.bio.back.models.user.Responsible;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Packaging.class)
public abstract class Packaging_ {

	public static volatile SingularAttribute<Packaging, Date> date;
	public static volatile SingularAttribute<Packaging, Double> totalHours;
	public static volatile SingularAttribute<Packaging, Responsible> responsible;
	public static volatile SingularAttribute<Packaging, LocalTime> startTime;
	public static volatile SingularAttribute<Packaging, LocalTime> endTime;
	public static volatile SingularAttribute<Packaging, Long> packagingId;

	public static final String DATE = "date";
	public static final String TOTAL_HOURS = "totalHours";
	public static final String RESPONSIBLE = "responsible";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String PACKAGING_ID = "packagingId";

}

