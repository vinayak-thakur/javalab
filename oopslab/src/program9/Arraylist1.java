package program9;

import java.util.*;

public class Arraylist1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> obj = new ArrayList<String>();
		int op, j;
		String str, ch;
		for (;;) {
			System.out.println("Select the operation ");
			System.out.print(
					"1.Append - at the end\n2.Insert - add at particular index\n3.Search\n4.List all String starting with given letter");

			op = sc.nextInt();

			switch (op) {

				case 1:
					System.out.println("Enter the element: ");
					str = sc.next();

					obj.add(str);
					break;

				case 2:
					System.out.println("Enter the element:");
					str = sc.next();
					System.out.println("Enter the index of the element: ");
					j = sc.nextInt();

					obj.add(j, str);
					break;

				case 3:
					System.out.println("Enter the element to be searched: ");
					str = sc.next();

					j = obj.indexOf(str);
					if (j == -1) {
						System.out.println("Element not found");
						break;
					}
					System.out.println("Element found at position: " + j);
					break;

				case 4:
					System.out.println("Enter the Specific Character: ");
					ch = sc.next();

					for (int i = 0; i < (obj.size()); i++) {
						str = obj.get(i);
						if (str.startsWith(ch)) {
							System.out.println(str + "\n");
						}
					}
					break;

			}
		}

	}
}