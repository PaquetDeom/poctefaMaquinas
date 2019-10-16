package sol;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-16T16:38:55.121+0200")
@StaticMetamodel(Teacher.class)
public class Teacher_ extends Person_ {
	public static volatile SingularAttribute<Teacher, Integer> id;
	public static volatile SingularAttribute<Teacher, String> username;
	public static volatile SingularAttribute<Teacher, Password> password;
	public static volatile ListAttribute<Teacher, Maquina> maquinas;
	public static volatile ListAttribute<Teacher, Student> students;
}
