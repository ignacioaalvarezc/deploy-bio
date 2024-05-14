package com.sys.bio.back.models.sized;

import com.sys.bio.back.models.user.Responsible;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sizing.class)
public abstract class Sizing_ {

	public static volatile SingularAttribute<Sizing, Date> date;
	public static volatile SingularAttribute<Sizing, Double> totalHours;
	public static volatile SingularAttribute<Sizing, Long> sizingId;
	public static volatile SingularAttribute<Sizing, Responsible> responsible;
	public static volatile SingularAttribute<Sizing, String> observations;
	public static volatile SingularAttribute<Sizing, LocalTime> startTime;
	public static volatile SingularAttribute<Sizing, LocalTime> endTime;

	public static final String DATE = "date";
	public static final String TOTAL_HOURS = "totalHours";
	public static final String SIZING_ID = "sizingId";
	public static final String RESPONSIBLE = "responsible";
	public static final String OBSERVATIONS = "observations";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";

}

