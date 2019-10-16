package sol;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-11T11:40:31.530+0200")
@StaticMetamodel(Clas.class)
public class Clas_ {
	public static volatile SingularAttribute<Clas, String> nameClass;
	public static volatile SingularAttribute<Clas, String> nameSchool;
	public static volatile ListAttribute<Clas, Student> students;
	public static volatile SingularAttribute<Clas, Integer> id;
}
