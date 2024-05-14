package com.sys.bio.back.models.cutting;

import com.sys.bio.back.models.user.Responsible;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cutting.class)
public abstract class Cutting_ {

	public static volatile SingularAttribute<Cutting, Date> date;
	public static volatile SingularAttribute<Cutting, Integer> totalAmount;
	public static volatile SetAttribute<Cutting, CutBox> cutBoxes;
	public static volatile SingularAttribute<Cutting, Integer> totalHours;
	public static volatile SingularAttribute<Cutting, Integer> totalMinutes;
	public static volatile SingularAttribute<Cutting, Responsible> responsible;
	public static volatile SingularAttribute<Cutting, String> observations;
	public static volatile SingularAttribute<Cutting, Double> totalWeight;
	public static volatile SingularAttribute<Cutting, Long> cuttingId;

	public static final String DATE = "date";
	public static final String TOTAL_AMOUNT = "totalAmount";
	public static final String CUT_BOXES = "cutBoxes";
	public static final String TOTAL_HOURS = "totalHours";
	public static final String TOTAL_MINUTES = "totalMinutes";
	public static final String RESPONSIBLE = "responsible";
	public static final String OBSERVATIONS = "observations";
	public static final String TOTAL_WEIGHT = "totalWeight";
	public static final String CUTTING_ID = "cuttingId";

}

