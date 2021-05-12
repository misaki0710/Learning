

public class Kadai01{
  public static void main(String[] args){
    System.out.println("【成績判定プログラム】");
    System.out.println("点数を入力してください");
    int score = new java.util.Scanner(System.in).nextInt();

    if(score >= 90){
      char seiseki = 'S' ;
      System.out.println( score + "点の成績は" + seiseki + "です" );
    }else if(score >= 80){
      char seiseki = 'A' ;
      System.out.println( score + "点の成績は" + seiseki + "です" );
    }else if(score >= 70){
      char seiseki = 'B' ;
      System.out.println( score + "点の成績は" + seiseki + "です" );
    }else if(score >= 60){
      char seiseki = 'C' ;
      System.out.println( score + "点の成績は" + seiseki + "です" );
    }else{
      char seiseki = 'F' ;
      System.out.println( score + "点の成績は" + seiseki + "です" );
    }

  }
}
