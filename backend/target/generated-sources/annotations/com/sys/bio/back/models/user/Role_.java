package com.sys.bio.back.models.user;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile SetAttribute<Role, UserRole> userRoles;
	public static volatile SingularAttribute<Role, Long> roleId;
	public static volatile SingularAttribute<Role, String> name;
	public static volatile SingularAttribute<Role, String> roleName;

	public static final String USER_ROLES = "userRoles";
	public static final String ROLE_ID = "roleId";
	public static final String NAME = "name";
	public static final String ROLE_NAME = "roleName";

}

