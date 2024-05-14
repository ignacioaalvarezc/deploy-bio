package com.sys.bio.back.models.sized;

import com.sys.bio.back.models.user.Responsible;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SizedBox.class)
public abstract class SizedBox_ {

	public static volatile SingularAttribute<SizedBox, Date> date;
	public static volatile SingularAttribute<SizedBox, LocalDate> filterDate;
	public static volatile SingularAttribute<SizedBox, Integer> number;
	public static volatile SingularAttribute<SizedBox, Integer> amount;
	public static volatile SingularAttribute<SizedBox, LocalTime> hour;
	public static volatile SingularAttribute<SizedBox, StrawType> strawType;
	public static volatile SingularAttribute<SizedBox, Responsible> responsible;
	public static volatile SingularAttribute<SizedBox, String> observations;
	public static volatile SingularAttribute<SizedBox, Double> weight;
	public static volatile SingularAttribute<SizedBox, Long> sizedBoxId;

	public static final String DATE = "date";
	public static final String FILTER_DATE = "filterDate";
	public static final String NUMBER = "number";
	public static final String AMOUNT = "amount";
	public static final String HOUR = "hour";
	public static final String STRAW_TYPE = "strawType";
	public static final String RESPONSIBLE = "responsible";
	public static final String OBSERVATIONS = "observations";
	public static final String WEIGHT = "weight";
	public static final String SIZED_BOX_ID = "sizedBoxId";

}

