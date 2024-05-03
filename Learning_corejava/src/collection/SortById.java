package collection;

import java.util.Comparator;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		int i;
		int a = o1.id;
		int b = o2.id;
		
		if(a>b)
		{
			i = -1;
		}
		else if(a<b)
		{
			i = 1;
		}
		else
		{
			i = 0;
		}
		
		
		return i;
	}

}
