public class Kadai02{
  public static void main(String[] args){
    String[] words1 = {
      "�������","�x�@���","�R�m�����","���i���",
      "�F�����","�������","�藠�����","��Ԑ��"
    };

    String[] words2 = {
      "���p�������W���[","�p�g�����W���[","�����E�\�E�W���[",
      "�L�����C�W���[","�L���E�����W���[","�W���E�I�E�W���[",
      "�j���j���W���[","�g�b�L���E�W���["
    };

    int idx1 = new java.util.Random().nextInt(words1.length);

    int idx2 = new java.util.Random().nextInt(words2.length);

    System.out.print(words1[idx1] + words2[idx2]);

  }
}
