package fr.paquet.framework.authentication;

import fr.paquet.framework.PoctefaItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-02T15:56:53.956+0200")
@StaticMetamodel(Role.class)
public class Role_ extends PoctefaItem_ {
	public static volatile SingularAttribute<Role, Integer> id;
	public static volatile SingularAttribute<Role, String> roleName;
	public static volatile SetAttribute<Role, User> users;
}
