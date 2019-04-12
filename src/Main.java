import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtrociousSort asort = new AtrociousSort();		

		String testCaseName = "empty list";
		List list = new ArrayList<Integer>() ;
		int test_case_no = 1;
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", before sort: List = " + list);
		asort.sort(list);
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", after sort: List = " + list);
		test_case_no++;


		testCaseName = "singleton list";
		list = new ArrayList<Integer>(Arrays.asList(1)) ;
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", before sort: List = " + list);
		asort.sort(list);
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", after sort: List = " + list);
		test_case_no++;
		
		
		testCaseName = "already sorted list";
		list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)) ;
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", before sort: List = " + list);
		asort.sort(list);
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", after sort: List = " + list);
		test_case_no++;
		
		
		testCaseName = "reverse list";
		list = new ArrayList<Integer>(Arrays.asList(5, 4, 3, 2, 1)) ;
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", before sort: List = " + list);
		asort.sort(list);
		System.out.println("Test case " + test_case_no + ", " + testCaseName + ", after sort: List = " + list);
		test_case_no++;
	}

}
