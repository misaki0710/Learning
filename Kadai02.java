public class Kadai02{
  public static void main(String[] args){
    String[] words1 = {
      "快盗戦隊","警察戦隊","騎士竜戦隊","魔進戦隊",
      "宇宙戦隊","動物戦隊","手裏剣戦隊","烈車戦隊"
    };

    String[] words2 = {
      "ルパンレンジャー","パトレンジャー","リュウソウジャー",
      "キラメイジャー","キュウレンジャー","ジュウオウジャー",
      "ニンニンジャー","トッキュウジャー"
    };

    int idx1 = new java.util.Random().nextInt(words1.length);

    int idx2 = new java.util.Random().nextInt(words2.length);

    System.out.print(words1[idx1] + words2[idx2]);

  }
}
