import javax.swing.*;

public class Rep02BinaryToDigit3 {
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
		
		while(true) {
			fourbitbinary=JOptionPane.showInputDialog("Enter a 4-bit binary number:");
			
			if(fourbitbinary.length()-1>4) {
				JOptionPane.showMessageDialog(null, "Invalid inpput. Please enter a 4-bit binary number.");
				int hol = JOptionPane.showConfirmDialog(null, "Do you want to convert another number?");
				if(hol == 0) {
					continue;
				}else {
					System.exit(0);
				}
			}
			if(!judgeNum(fourbitbinary)){
				JOptionPane.showMessageDialog(null, "Invalid inpput. Please enter a 4-bit binary number.");
				int hol = JOptionPane.showConfirmDialog(null, "Do you want to convert another number?");
				if(hol == 0) {
					continue;
				}else {
					System.exit(0);
				}			}
			fbitb = Integer.parseInt(fourbitbinary ,2);
			
			
			
			JOptionPane.showMessageDialog(null, "The decimal value is: " + fbitb);
			
			int hol = JOptionPane.showConfirmDialog(null, "Do you want to convert another number?");
			if(hol == 0) {
				continue;
			}else {
				System.exit(0);
			}
			
			
		}
	}

}
