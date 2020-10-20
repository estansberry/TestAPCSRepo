public class Demo{
  public static void main(String[] args) {
    int firstArg;
    try { firstArg = Integer.parseInt(args[0]);
    } catch (Exception e){
      firstArg = 5;
    }
    printLoop(firstArg);
  }
  public static void printLoop(int n){
    for(int i = 0; i < n; i ++){
      for (int j = n - i; j > 0; j = j - 1){
        System.out.print(i + 1);
      }System.out.println("");
      }
    }
}
