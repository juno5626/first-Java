import javax.swing.*;

public class Rep02BinaryToDigit1 {

	public static void main(String[] args) {
		String forbitbinary;
		forbitbinary=JOptionPane.showInputDialog("Enter a 4-bit binary number:");
		int fbitb;
		fbitb = Integer.parseInt(forbitbinary ,2);
		JOptionPane.showMessageDialog(null, "The decimal value is: " + fbitb);
	}

}
