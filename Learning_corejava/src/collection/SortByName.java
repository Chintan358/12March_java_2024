package collection;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
//		return -o1.name.compareTo(o2.name);
		return o2.name.compareTo(o1.name);
	}

}
