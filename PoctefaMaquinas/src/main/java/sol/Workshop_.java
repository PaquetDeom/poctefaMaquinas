package sol;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-11T11:43:28.586+0200")
@StaticMetamodel(Workshop.class)
public class Workshop_ {
	public static volatile ListAttribute<Workshop, Maquina> maquinas;
	public static volatile SingularAttribute<Workshop, Integer> id;
	public static volatile SingularAttribute<Workshop, String> name;
	public static volatile SingularAttribute<Workshop, HighSchool> highSchool;
}
