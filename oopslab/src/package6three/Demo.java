package package6three ;
import java.util.* ;
import package6.Currencyc ;
import package6one.Timec;
import package6two.Distancec ;






public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int choice, ch;
	while(5>2) {
			System.out.println("1.Currency Converter\n2.Distance Converter\n3.Time Converter\n");
			System.out.println("Enter The Choice: ");
			choice = sc.nextInt();
			switch(choice){
				case 1 :
					Currencyc c = new Currencyc();
					System.out.println("1.DollarToINR\n2.EuroToINR\n3.YenToINR\n4.INRToDollar\n5.INRToEuro\n6.INRToYen\n");
					System.out.println("Enter The Choice: ");
					ch = sc.nextInt();
				switch(ch){
					case 1:
						c.DollarToINR();
						break;
					case 2:
						c.EuroToINR();
						break;
					case 3:
						c.YenToINR();
						break;
					case 4:
						c.INRToDollar();
						break;
					case 5:
						c.INRToEuro();
						break;
					case 6:
						c.INRToYen();
						break;
				}
				break;
				case 2:
					Distancec d = new Distancec();
					System.out.println("1.MtToKM\n2.MiToKM\n3.KMToMt\n4.KMToMi\n");
					System.out.println("Enter The Choice: ");
					ch = sc.nextInt();
					switch(ch){
						case 1:
							d.MtToKM();
							break;
						case 2:
							d.MiToKM();
							break;
						case 3:
							d.KMToMt();
							break;
						case 4:
							d.KMToMi();
							break;
					}
					break;
				case 3:
					Timec t = new Timec();
					System.out.println("1.HrToMin\n2.HrToSec\n3.MinToHr\n4.SecToHr\n");
					System.out.println("Enter The Choice: ");
					ch = sc.nextInt();
					switch(ch){
					case 1:
						t.HrToMin();
						break;
					case 2:
						t.HrToSec();
						break;
					case 3:
						t.MinToHr();
						break;
					case 4:
						t.SecToHr();
						break;
					}
					break;
			}
	}
  }
}
	


