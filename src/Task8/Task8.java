package Task8;

import java.util.Arrays;
import java.util.Scanner;

/*
 ����������� ���� ������ � ���������� � ������, � ����� ����� ����������� ����� ������� �� �����, ��� ������ ������� ������� ���������� �� 2.
 */
public class Task8 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		    int numbers [] = new int[3];

		    
		    for (int i = 0; i < numbers.length; i++)
		    {
		        System.out.println("������� �����");
		        numbers[i] = in.nextInt();
		       int x = numbers[i]*2;
		    }
		    for (int i = 0; i < numbers.length; i++) {
		        System.out.print ( " " + numbers[i] * 2); 
		    }
	}
}