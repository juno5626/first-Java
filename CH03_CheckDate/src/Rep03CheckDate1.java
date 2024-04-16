import java.util .*;

public class Rep03CheckDate1 {

    public static void main(String[] args) {
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
            System.out.println("Invalid format. Please enter the date in mm/dd/yyyy format.");

        }else if (date[1].length()!=2||!Character.isDigit(date[1].charAt(0))||!Character.isDigit(date[1].charAt(1))) {
            System.out.println("Invalid format. Please enter the date in mm/dd/yyyy format.");

        }else if (date[2].length()!=4||!Character.isDigit(date[2].charAt(0))||!Character.isDigit(date[2].charAt(1))||!Character.isDigit(date[2].charAt(2))||!Character.isDigit(date[2].charAt(3))) {
            System.out.println("Invalid format. Please enter the date in mm/dd/yyyy format.");

        }else {
            System.out.println("Your date was "+date[0]+"/"+date[1]+"/"+date[2]);
            System.out.println("It is a valid date.");

        }
        
        
        
        scan.close();
        scan1.close();


    }

}

