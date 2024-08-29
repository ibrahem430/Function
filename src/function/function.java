package function;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class function {

	static void printmyname(String myname, int Yourbirthday, int Yourbirthmonth, int Youryearofbirth) {
		System.out.println("welcome " + myname + " your date of birth is " +Yourbirthday+"/"+Yourbirthmonth+"/"+Youryearofbirth);
	}
	public static void main(String[] args) {
		int	birthday=0;
		int Yourbirthmonth=0;
		int Yourbirthyear=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name ?");
		String myname = scanner.nextLine();

		for(int i=0;i<i+1;i++)
		{
			System.out.println(" what is Your birth day");
		int  yourbirthday=scanner.nextInt(			);
		if(yourbirthday>0&&yourbirthday<32) {					
			birthday=yourbirthday;
			break;
		}
		else {
			continue;
		}
			}
		for(int i=0;i<i+1;i++)
		{
			System.out.println("what is Your birth month");
			int Yourbirthmonth1=scanner.nextInt();
		if(Yourbirthmonth1>0&&Yourbirthmonth1<13) {					
			Yourbirthmonth=Yourbirthmonth1;
			break;
		}
		else {
			continue;
		}
		}

		for(int i=0;i<i+1;i++)
		{
			System.out.println("what is Your birth year");
			int Yourbirthyear1=scanner.nextInt();
		
		if(Yourbirthyear1>1900&&Yourbirthyear1<2024) {					
			Yourbirthyear=Yourbirthyear1;
			break;
		}
		else {
			continue;
		}
		}
		printmyname(myname,birthday,Yourbirthmonth,Yourbirthyear);
		}
		}

