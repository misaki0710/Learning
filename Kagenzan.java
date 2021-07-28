public class Kagenzan{
	int kekka;
	public void tashizan(int su1,int su2){
		kekka = su1 + su2;
	}
	public void hikizan(int su1,int su2){
		kekka = su1 - su2;
	}
	public void hyoji(){
		System.out.println(kekka);
	}
}