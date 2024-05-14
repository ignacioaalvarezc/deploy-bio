package com.sys.bio.back.models.order;

import com.sys.bio.back.models.packaging.BoxType;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Date> pickUpDate;
	public static volatile SingularAttribute<Order, Integer> packagesNumber;
	public static volatile SingularAttribute<Order, String> indications;
	public static volatile SingularAttribute<Order, Long> orderNumber;
	public static volatile SingularAttribute<Order, Integer> strawsNumber;
	public static volatile SingularAttribute<Order, Long> orderId;
	public static volatile SingularAttribute<Order, BoxType> boxType;
	public static volatile SingularAttribute<Order, LocalTime> pickUpHour;
	public static volatile SingularAttribute<Order, Boolean> enabled;

	public static final String PICK_UP_DATE = "pickUpDate";
	public static final String PACKAGES_NUMBER = "packagesNumber";
	public static final String INDICATIONS = "indications";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String STRAWS_NUMBER = "strawsNumber";
	public static final String ORDER_ID = "orderId";
	public static final String BOX_TYPE = "boxType";
	public static final String PICK_UP_HOUR = "pickUpHour";
	public static final String ENABLED = "enabled";

}

