public class Rep03GradesGraphTest2
{
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println("Test case 1: readInput() and writeOutput()");
      Rep03GradesGraph2 grades = new Rep03GradesGraph2();
      grades.readInput();
      System.out.println();
            System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      System.out.println("return total number of grades");
      System.out.println();
      System.out.println("Total number of grades = "
      						+ grades.getTotalNumberOfGrades());
      System.out.println();
      System.out.println("===============================");

      System.out.println();
      System.out.println("Test case 2:");
      System.out.println("set counts as a group: A=1, B=2, C=3, D=4, F=5 etc.");
      grades.set(1, 2, 3, 4, 5);
      System.out.println();
      System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      System.out.println("return total number of grades");
      System.out.println();
      System.out.println("Total number of grades = "
      						+ grades.getTotalNumberOfGrades());
      System.out.println();
      System.out.println("===============================");

      System.out.println();
      System.out.println("Test case 3:");
      System.out.println("set counts individually");
      System.out.println("A=10, B=9, etc.");
      grades.setAcount(10);
      grades.setBcount(9);
      grades.setCcount(8);
      grades.setDcount(7);
      grades.setFcount(6);
      System.out.println();
      System.out.println("Verify results with writeOutput():");
      grades.writeOutput();
      System.out.println();
      System.out.println("return total number of grades");
      System.out.println();
      System.out.println("Total number of grades = "
      						+ grades.getTotalNumberOfGrades());
      System.out.println();
      System.out.println("===============================");

      System.out.println();
      System.out.println("Test case 4:");
      System.out.println("set counts individually");
      System.out.println("A=16, B=3, etc.");
      grades.setAcount(16);
      grades.setBcount(3);
      grades.setCcount(7);
      grades.setDcount(5);
      grades.setFcount(10);
      System.out.println();
      System.out.println("write (display) counts individually:");
      System.out.println();
      System.out.println("Verify A=16, B=3, etc.");
      System.out.println();
      grades.writeAcount();
      grades.writeBcount();
      grades.writeCcount();
      grades.writeDcount();
      grades.writeFcount();
      System.out.println();
      System.out.println("return total number of grades");
      System.out.println();
      System.out.println("Total number of grades = "
      						+ grades.getTotalNumberOfGrades());
      System.out.println();
      System.out.println("===============================");

      System.out.println();
      System.out.println("Test case 5:");
      System.out.println("set counts as a group: A=5, B=2, C=6, D=2, F=9 etc.");
      grades.set(5, 2, 6, 2, 9);
      System.out.println();
      System.out.println("return counts individually:");
      System.out.println();
      System.out.println("Verify A=5, B=2, etc.");
      System.out.println();
      System.out.println("A count = " + grades.getAcount());
      System.out.println("B count = " + grades.getBcount());
      System.out.println("C count = " + grades.getCcount());
      System.out.println("D count = " + grades.getDcount());
      System.out.println("F count = " + grades.getFcount());
      System.out.println();
      System.out.println();
      System.out.println("return total number of grades");
      System.out.println();
      System.out.println("Total number of grades = "
      						+ grades.getTotalNumberOfGrades());
      System.out.println();
      System.out.println("===============================");
   }
}
