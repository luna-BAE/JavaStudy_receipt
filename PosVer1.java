package Receipt;

import java.util.Scanner;

public class PosVer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		String storeName = "비트 편의점 :)";
		
		String water = "생수";
		String cookie = "쌀과자";
		String gum = "껌";
		String coffee = "커피";
		
		String goodsList="";
		
		String[][] info = {{"생수", "900"}, {"쌀과자", "2300"}};
		
		while (run) {
			System.out.println(storeName);
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("1. 생수 | 2. 쌀과자 | 3. 껌 | 4. 커피 | 5. 선택 종료");
			System.out.println("원하시는 상품의 번호 선택해주세요 > ");
		
		
			int goods1 = scanner.nextInt();
			System.out.println();
			
			if(goods1==1) {
				goodsList += water+"   |  900  |   1   |  900\n";
			}
			
			if(goods1==2) {
				goodsList += cookie+"  | 2300  |   2   |  4600\n";
			}
			
			if(goods1==3) {
				goodsList += gum+"     |  500  |   3   |  1500\n";
			}
			
			if(goods1==4) {
				goodsList += coffee+"   |  1200  |   1  |  1200\n";
			}
			
			if(goods1==5) {
				break;
			}
		
			
		}
		System.out.println(storeName);
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("제품명  |  단가  |  수량  |  계");
		System.out.println("-----------------------------");
		System.out.println(goodsList);
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("\t\t합계 : ");

	}
	

}


