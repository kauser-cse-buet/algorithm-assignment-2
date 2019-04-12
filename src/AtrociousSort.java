import java.util.List;

public class AtrociousSort implements Sorter{

	@Override
	public boolean inOrder(Object e1, Object e2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort(List list) {
		// TODO Auto-generated method stub
		if(list.size() <= 1) {
			return;
		}
		else {
			int first = (int) list.remove(0);
			sort(list);
			if(first <= (int)list.get(0)) {
				list.add(0, first);
			}
			else {
				int first_sorted_small_list = (int) list.remove(0);
				list.add(0, first);
				first = first_sorted_small_list;
				
				sort(list);
				list.add(0, first);
			}
			
		}
		
		return;
	}
}

