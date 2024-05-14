package com.sys.bio.back.models.packaging;

import com.sys.bio.back.models.user.Responsible;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Package.class)
public abstract class Package_ {

	public static volatile SingularAttribute<Package, Date> date;
	public static volatile SingularAttribute<Package, LocalDate> filterDate;
	public static volatile SingularAttribute<Package, LocalTime> hour;
	public static volatile SingularAttribute<Package, Responsible> responsible;
	public static volatile SingularAttribute<Package, Long> packageId;
	public static volatile SingularAttribute<Package, Packaging> packaging;
	public static volatile SingularAttribute<Package, BoxType> boxType;
	public static volatile SingularAttribute<Package, Integer> boxAmount;
	public static volatile SingularAttribute<Package, Integer> strawAmount;
	public static volatile SingularAttribute<Package, Integer> weightRejected;
	public static volatile SingularAttribute<Package, Integer> strawRejected;

	public static final String DATE = "date";
	public static final String FILTER_DATE = "filterDate";
	public static final String HOUR = "hour";
	public static final String RESPONSIBLE = "responsible";
	public static final String PACKAGE_ID = "packageId";
	public static final String PACKAGING = "packaging";
	public static final String BOX_TYPE = "boxType";
	public static final String BOX_AMOUNT = "boxAmount";
	public static final String STRAW_AMOUNT = "strawAmount";
	public static final String WEIGHT_REJECTED = "weightRejected";
	public static final String STRAW_REJECTED = "strawRejected";

}

