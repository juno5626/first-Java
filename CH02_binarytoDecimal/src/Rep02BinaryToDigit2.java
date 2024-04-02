import javax.swing.*;

public class Rep02BinaryToDigit2 {
	public static boolean judgeNum(String number) {
		for(char one : number.toCharArray()) {
			if(!(one=='0'||one=='1')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String fourbitbinary;
		int fbitb;
		
		
		fourbitbinary=JOptionPane.showInputDialog("Enter a 4-bit binary number:");
		
		if(fourbitbinary.length()>4) {
			JOptionPane.showMessageDialog(null, "Invalid inpput. Please enter a 4-bit binary number.");
			System.exit(0);
		}
		if(!judgeNum(fourbitbinary)){
			JOptionPane.showMessageDialog(null, "Invalid inpput. Please enter a 4-bit binary number.");
			System.exit(0);
		}
		fbitb = Integer.parseInt(fourbitbinary ,2);
		
		
		
		JOptionPane.showMessageDialog(null, "The decimal value is: " + fbitb);
	}

}
