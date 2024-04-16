import java.util .*;

public class Rep03CheckDate2 {

    public static void main(String[] args) {
    	int jud = 0;
        String exit = "exit";
        String[] date= new String[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a date to be checked (mm/dd/yyyy), or type 'exit' to quit");       
        String full = scan.nextLine();
        
        if (full.equals(exit)) {
            System.out.println("Program terminated");
            scan.close();
            return;
        } 
        Scanner scan1 = new Scanner(full).useDelimiter("/");
    
        int i = 0;
        while (scan1.hasNext()) {
            date[i] = scan1.next();
            i++;
        }
        
        if (date[0].length()!=2||!Character.isDigit(date[0].charAt(0))||!Character.isDigit(date[0].charAt(1))) {
        	printMassage();
        	jud=1;
            scan.close();
;

        }else if (date[1].length()!=2||!Character.isDigit(date[1].charAt(0))||!Character.isDigit(date[1].charAt(1))) {
        	printMassage();
        	jud=1;
            scan.close();
;

        }else if (date[2].length()!=4||!Character.isDigit(date[2].charAt(0))||!Character.isDigit(date[2].charAt(1))||!Character.isDigit(date[2].charAt(2))||!Character.isDigit(date[2].charAt(3))) {
        	printMassage();
        	jud=1;
            scan.close();
;

        }
        
        int leapjudge = isLeapYear(Integer.parseInt(date[2]));

        
        
        System.out.println("Date is "+Integer.parseInt(date[0])+"/"+date[1]+"/"+date[2]);
        System.out.println("Your date was "+date[0]+"/"+date[1]+"/"+date[2]);

        
        
        if (Integer.parseInt(date[0])>12) {
        	printMassage(0,0,leapjudge);
        	jud=1;

        }
        
        if (Integer.parseInt(date[1])>dayJudge(Integer.parseInt(date[0]),leapjudge)) {
        	printMassage(1,Integer.parseInt(date[0]),leapjudge);
        	jud=1;

        }

         if(jud==0) {
             System.out.println("It is a valid date.");

         }
        

        scan.close();
        scan1.close();


    }
    
    public static void printMassage() {
        System.out.println("Invalid format. Please enter the date in mm/dd/yyyy format.");
        
    }
    public static void printMassage(int a,int b,int leapjud) {
        System.out.println("It is not vaild date.");
        System.out.print("The reason it is invalid: ");
        switch(a) {
        case 0:
            System.out.println("The month value is not from 1 to 12.");
            break;
        case 1:
        	System.out.print("The day value is greater than "+dayJudge(b , leapjud)+" in ");
        	printEng(b);
        	if(leapjud==1&&b==2) {
        		System.out.println(" in a leap year.");
        	}else if(leapjud==0&&b==2) {
        		System.out.println(" in a non-leap year.");
        	}
            break;
        	

        }
        
    }
    public static int isLeapYear(int year) {
      
        if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
        	return 1;
        }
        return 0;
    }
    
    public static int dayJudge(int month , int jud) {
        
    	if(jud==1&&month==2) {
    		return 29;
    	}else if(month == 1||month == 3||month ==5||month ==7||month ==8||month ==10||month ==12) {
    		return 31;
    	}else if(jud==0&&month==2) {
    		return 28;
    	}else {
    		return 30;
    	}
    }
    
    public static void printEng(int a) {
    	switch(a) {
    	case 1:
        	System.out.print("January");
        	break;
    	case 2:
        	System.out.print("February");
        	break;
    	case 3:
        	System.out.print("March");
        	break;
    	case 4:
        	System.out.print("April");
        	break;
    	case 5:
        	System.out.print("May");
        	break;
    	case 6:
        	System.out.print("June");
        	break;
    	case 7:
        	System.out.print("July");
        	break;
    	case 8:
        	System.out.print("August");
        	break;
    	case 9:
        	System.out.print("September");
        	break;
    	case 10:
        	System.out.print("October");
        	break;
    	case 11:
        	System.out.print("November");
        	break;
    	case 12:
        	System.out.print("December");
        	break;

    	}
    }

}

