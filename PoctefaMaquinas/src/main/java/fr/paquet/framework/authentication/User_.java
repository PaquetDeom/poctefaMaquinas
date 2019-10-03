package fr.paquet.framework.authentication;

import fr.paquet.framework.PoctefaItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-02T15:56:53.968+0200")
@StaticMetamodel(User.class)
public class User_ extends PoctefaItem_ {
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> salt;
	public static volatile SingularAttribute<User, String> nom;
	public static volatile SingularAttribute<User, String> prenom;
	public static volatile ListAttribute<User, Role> roles;
	public static volatile ListAttribute<User, Permission> permissions;
}
