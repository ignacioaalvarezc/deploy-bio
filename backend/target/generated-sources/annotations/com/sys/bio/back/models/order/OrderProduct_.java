package com.sys.bio.back.models.order;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderProduct.class)
public abstract class OrderProduct_ {

	public static volatile SingularAttribute<OrderProduct, String> provider;
	public static volatile SingularAttribute<OrderProduct, String> name;
	public static volatile SingularAttribute<OrderProduct, String> format;
	public static volatile SingularAttribute<OrderProduct, String> description;
	public static volatile SingularAttribute<OrderProduct, Long> orderProductId;
	public static volatile SingularAttribute<OrderProduct, Integer> strawAmount;
	public static volatile SingularAttribute<OrderProduct, Boolean> enabled;

	public static final String PROVIDER = "provider";
	public static final String NAME = "name";
	public static final String FORMAT = "format";
	public static final String DESCRIPTION = "description";
	public static final String ORDER_PRODUCT_ID = "orderProductId";
	public static final String STRAW_AMOUNT = "strawAmount";
	public static final String ENABLED = "enabled";

}

