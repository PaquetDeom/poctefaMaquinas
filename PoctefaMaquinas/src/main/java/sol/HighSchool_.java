package sol;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-11T15:21:14.369+0200")
@StaticMetamodel(HighSchool.class)
public class HighSchool_ {
	public static volatile ListAttribute<HighSchool, Teacher> lt;
	public static volatile ListAttribute<HighSchool, Student> ls;
	public static volatile ListAttribute<HighSchool, Clas> lc;
	public static volatile ListAttribute<HighSchool, Workshop> workshops;
	public static volatile SingularAttribute<HighSchool, String> name;
	public static volatile SingularAttribute<HighSchool, String> code;
	public static volatile SingularAttribute<HighSchool, Integer> id;
}
