package dev.luispardo.javaloops;

public class MultiplicationTable2 {
  
  public static String[] generateMultiplicationTable2(int n) {
      String[] table = new String[10];
      for (int i = 1; i <= 10; i++) {
          int result = n * i;
          table[i - 1] = n + " x " + i + " = " + result;
      }
      return table;
  }


  
//Giaco: ¿Darías por válido siguiente código para imprimir la tabla en terminal?

  public static void main(String[] args) {
      int n = 5;
      String[] multiplicationTable = generateMultiplicationTable2(n);
      for (String line : multiplicationTable) {
          System.out.println(line);
      }
  }
}
