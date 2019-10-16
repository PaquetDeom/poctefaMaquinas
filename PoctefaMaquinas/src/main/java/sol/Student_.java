package sol;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-11T12:10:02.228+0200")
@StaticMetamodel(Student.class)
public class Student_ extends Person_ {
	public static volatile ListAttribute<Student, Maquina> maquinas;
	public static volatile ListAttribute<Student, Teacher> teachers;
	public static volatile SingularAttribute<Student, Clas> clas;
}
