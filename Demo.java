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
  public static String arrToString(int[] arr){
    String newstr = "{";
    if (arr.length == 0){
      return("{}");
    }
    for (int i = 0; i < arr.length - 1; i ++){
      newstr = newstr + arr[i];
      newstr = newstr + ", ";
    }newstr = newstr + arr[arr.length - 1] + "}";
      return(newstr);
  }
  public static String arrayDeepToString(int[][] arr){
    String newstr = "{";
    if (arr.length == 0){
      return("{}");
    }
    for (int i = 0; i < arr.length - 1; i ++){
      newstr = newstr + arrToString(arr[i]);
      newstr = newstr + ", ";
    }newstr = newstr + arrToString(arr[arr.length - 1]) + "}";
      return(newstr);
  }

    public static int[][] create2DArray (int rows, int cols, int maxValue){
      int[][] newarr;
      newarr = new int[rows][cols];
      for(int i = 0; i < rows; i ++){
        for(int j = 0; j < cols; j ++){
          int newval = (int) Math.floor(Math.random() * (maxValue + 1));
          newarr[i][j] = newval;
        }
      }return(newarr);
  }
    public static int[][] create2DArrayRandomized (int rows, int cols, int maxValue){
      int[][] newarr;
      int columns = (int) Math.floor(Math.random() * (cols + 1));
      newarr = new int[rows][columns];
      for(int i = 0; i < rows; i ++){
        for(int j = 0; j < columns; j ++){
          int newval = (int) Math.floor(Math.random() * (maxValue + 1));
          newarr[i][j] = newval;
        }
      }return(newarr);
    }

}
