public class example {

    public static void main(String args[]){
      double var1 = 20.00d;
      double var2 = 93.00d;
      double var3 = (var1 + var2) * 100.00;

      double rem = var3 % 40.00;

      boolean output = (rem == 0) ? true : false;
      System.out.println(output);

      if(output != true){
          System.out.println("Got some remainder");
      }

    }
}
