package com.sys.bio.back.models.item;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SecurityItem.class)
public abstract class SecurityItem_ {

	public static volatile SingularAttribute<SecurityItem, Long> securityItemId;
	public static volatile SingularAttribute<SecurityItem, Integer> amount;
	public static volatile SingularAttribute<SecurityItem, String> name;

	public static final String SECURITY_ITEM_ID = "securityItemId";
	public static final String AMOUNT = "amount";
	public static final String NAME = "name";

}

