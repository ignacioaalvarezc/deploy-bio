package com.sys.bio.back.models.sanitized;

import com.sys.bio.back.models.sized.StrawType;
import com.sys.bio.back.models.user.Responsible;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SanitizedBox.class)
public abstract class SanitizedBox_ {

	public static volatile SingularAttribute<SanitizedBox, Date> date;
	public static volatile SingularAttribute<SanitizedBox, LocalDate> filterDate;
	public static volatile SingularAttribute<SanitizedBox, Sanitized> sanitized;
	public static volatile SingularAttribute<SanitizedBox, StrawType> strawType;
	public static volatile SingularAttribute<SanitizedBox, Double> hoursBetweenDryingBeginAndEnding;
	public static volatile SingularAttribute<SanitizedBox, Double> weightAfterDrying;
	public static volatile SingularAttribute<SanitizedBox, Double> weightGainPercentage;
	public static volatile SingularAttribute<SanitizedBox, Long> sanitizedBoxId;
	public static volatile SingularAttribute<SanitizedBox, LocalTime> hourDryingEnd;
	public static volatile SingularAttribute<SanitizedBox, Double> weightBeforeDrying;
	public static volatile SingularAttribute<SanitizedBox, Double> wetWeight;
	public static volatile SingularAttribute<SanitizedBox, Integer> numberBox;
	public static volatile SingularAttribute<SanitizedBox, String> observations;
	public static volatile SingularAttribute<SanitizedBox, Responsible> responsible;
	public static volatile SingularAttribute<SanitizedBox, LocalTime> hourDryingBegin;
	public static volatile SingularAttribute<SanitizedBox, Boolean> state;
	public static volatile SingularAttribute<SanitizedBox, LocalTime> hourSanitized;
	public static volatile SingularAttribute<SanitizedBox, Double> waterRetentionPercentage;

	public static final String DATE = "date";
	public static final String FILTER_DATE = "filterDate";
	public static final String SANITIZED = "sanitized";
	public static final String STRAW_TYPE = "strawType";
	public static final String HOURS_BETWEEN_DRYING_BEGIN_AND_ENDING = "hoursBetweenDryingBeginAndEnding";
	public static final String WEIGHT_AFTER_DRYING = "weightAfterDrying";
	public static final String WEIGHT_GAIN_PERCENTAGE = "weightGainPercentage";
	public static final String SANITIZED_BOX_ID = "sanitizedBoxId";
	public static final String HOUR_DRYING_END = "hourDryingEnd";
	public static final String WEIGHT_BEFORE_DRYING = "weightBeforeDrying";
	public static final String WET_WEIGHT = "wetWeight";
	public static final String NUMBER_BOX = "numberBox";
	public static final String OBSERVATIONS = "observations";
	public static final String RESPONSIBLE = "responsible";
	public static final String HOUR_DRYING_BEGIN = "hourDryingBegin";
	public static final String STATE = "state";
	public static final String HOUR_SANITIZED = "hourSanitized";
	public static final String WATER_RETENTION_PERCENTAGE = "waterRetentionPercentage";

}

