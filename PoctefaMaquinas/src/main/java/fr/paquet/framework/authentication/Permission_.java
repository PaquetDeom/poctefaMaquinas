package fr.paquet.framework.authentication;

import fr.paquet.framework.PoctefaItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-02T15:56:53.902+0200")
@StaticMetamodel(Permission.class)
public class Permission_ extends PoctefaItem_ {
	public static volatile SingularAttribute<Permission, Integer> id;
	public static volatile SingularAttribute<Permission, String> permission;
	public static volatile SingularAttribute<Permission, User> user;
}
