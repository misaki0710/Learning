

public class Kadai01{
  public static void main(String[] args){
    System.out.println("�y���є���v���O�����z");
    System.out.println("�_������͂��Ă�������");
    int score = new java.util.Scanner(System.in).nextInt();

    if(score >= 90){
      char seiseki = 'S' ;
      System.out.println( score + "�_�̐��т�" + seiseki + "�ł�" );
    }else if(score >= 80){
      char seiseki = 'A' ;
      System.out.println( score + "�_�̐��т�" + seiseki + "�ł�" );
    }else if(score >= 70){
      char seiseki = 'B' ;
      System.out.println( score + "�_�̐��т�" + seiseki + "�ł�" );
    }else if(score >= 60){
      char seiseki = 'C' ;
      System.out.println( score + "�_�̐��т�" + seiseki + "�ł�" );
    }else{
      char seiseki = 'F' ;
      System.out.println( score + "�_�̐��т�" + seiseki + "�ł�" );
    }

  }
}
