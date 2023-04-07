package package9;
import java.util.* ;

public class Arraylist1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j,ch,ind;
		String str;
		String t;
		
		ArrayList <String> obj=new ArrayList<String>();
		
		for(;;) {
			System.out.println("Select the operation");
			System.out.println("1.Append at the end\n2.Insert at particular index\n3.Search\n4.List string starting with letter t\n5.Length of arraylist\n6.Remove\n7.Sorting\n8.Display\n9.EXIT");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the string:");
				str=sc.next();
				obj.add(str);
				break;
			case 2:
				System.out.println("Enter the string");
				str=sc.next();
				System.out.println("Enter the index");
				ind = sc.nextInt();
				obj.add(ind,str);
				break;
			case 3:
				System.out.println("Enter the string to be searched");
				str=sc.next();
				j=obj.indexOf(str);
				if(j==-1) {
					System.out.println("Element not found");
					break;
				}
				System.out.println("The element "+str+" found at position"+(j+1));
				break;
			case 4:	
				System.out.println("Enter the character");
				t=sc.next();
				for(int i=0;i<(obj.size()-1);i++) {
					str=obj.get(i);
					if(str.startsWith(t)) {
						System.out.println(str+"\n");
					}
				}
				break;
		
			}
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

