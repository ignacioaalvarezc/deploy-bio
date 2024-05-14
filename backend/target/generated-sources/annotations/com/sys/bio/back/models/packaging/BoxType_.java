package com.sys.bio.back.models.packaging;

import com.sys.bio.back.models.order.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BoxType.class)
public abstract class BoxType_ {

	public static volatile SingularAttribute<BoxType, Long> boxTypeId;
	public static volatile SingularAttribute<BoxType, String> provider;
	public static volatile SingularAttribute<BoxType, String> name;
	public static volatile SingularAttribute<BoxType, String> format;
	public static volatile SingularAttribute<BoxType, String> description;
	public static volatile SetAttribute<BoxType, Order> orders;
	public static volatile SingularAttribute<BoxType, Integer> strawAmount;
	public static volatile SetAttribute<BoxType, Package> packages;
	public static volatile SingularAttribute<BoxType, Boolean> enabled;

	public static final String BOX_TYPE_ID = "boxTypeId";
	public static final String PROVIDER = "provider";
	public static final String NAME = "name";
	public static final String FORMAT = "format";
	public static final String DESCRIPTION = "description";
	public static final String ORDERS = "orders";
	public static final String STRAW_AMOUNT = "strawAmount";
	public static final String PACKAGES = "packages";
	public static final String ENABLED = "enabled";

}

