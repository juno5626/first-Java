public class Rep03GradesGraphTest3
{
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println("Test case 1: readInput() and writeOutput()");
      Rep03GradesGraph3 grades = new Rep03GradesGraph3();
      grades.readInput();
      System.out.println();
            System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      grades.draw();
      System.out.println("===============================");
      System.out.println();

      System.out.println();
      System.out.println("Test case 2:");
      System.out.println("set counts as a group: A=1, B=2, c=3,d=4,e=5 etc.");
      grades.set(1, 2, 3, 4, 5);
      System.out.println();
      System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      grades.draw();
      System.out.println("===============================");
      System.out.println();

      System.out.println();
      System.out.println("Test case 3:");
      System.out.println("set counts individually");
      System.out.println("A=5, B=3, etc.");
      grades.setAcount(5);
      grades.setBcount(3);
      grades.setCcount(2);
      grades.setDcount(1);
      grades.setFcount(9);
      System.out.println();
      System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      grades.draw();
      System.out.println("===============================");
      System.out.println();

      System.out.println();
      System.out.println("Test case 4:");
      System.out.println("return percentages of each grade");
      System.out.println();
      grades.set(10, 9, 8, 7, 6);
      System.out.println("Verify percentages A=25, B=23, C=20, D=18, F=15");
      System.out.println();
      System.out.println("A = " + grades.getPercentA());
      System.out.println("B = " + grades.getPercentB());
      System.out.println("C = " + grades.getPercentC());
      System.out.println("D = " + grades.getPercentD());
      System.out.println("F = " + grades.getPercentF());
      System.out.println();
      grades.draw();
      System.out.println("===============================");
      System.out.println();

      System.out.println();
      System.out.println("Test case 5:");
      System.out.println("Draw graph of grade percentages");
      System.out.println();
      System.out.println("Verify A=100%");
      grades.set(1, 0, 0, 0, 0);
      System.out.println();
      grades.draw();
      System.out.println("===============================");
      System.out.println();

      System.out.println();
      System.out.println("Test case 6:");
      System.out.println("Draw graph of grade percentages");
      System.out.println();
      System.out.println("Verify all 0%");
      grades.set(0, 0, 0, 0, 0);
      System.out.println();
      grades.draw();

   }
}
