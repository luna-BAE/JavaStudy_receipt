package Receipt;

import java.util.Scanner;

public class PosVer4 {

	public static void main(String[] args) {

		// 해결과제 1. 상품 등록 기능 추가
		// 해결과제 2. 유효성 검사 코드 추가
		// 해결과제 3. 선택 종료 시 while문을 벗어나야 함(while문 설계를 다시 해야할 것 같음 ....)
		// 해결과제 4. 선택 종료 시 상품을 선택했는지 여부를 확인해야 함
		// 해결과제 5. 유효성 검사에서 걸릴 경우 리턴하는 방법
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		String storeName = "달구네 만물상";
		
		String[][] result = {{"생수", "900"},{"커피", "2500"},{"라면", "1200"},{"젤리","500"}};
		
		String customerOrder = "";
		int total = 0;
		
		String orderOutline = "---------------------------------------------";
		String receiptOutline = "-----------------------------";
		
		
		int choice = scan.nextInt();
		if ( choice < 0 || choice > 6) {
			
		}
		
			System.out.println(storeName);
			System.out.println(orderOutline);
			System.out.println(orderOutline);
			System.out.println("1."+result[0][0]+" 2."+result[1][0]+" 3."+result[2][0]+" 4."+result[3][0]+" 5.선택 종료");
			System.out.println("원하시는 상품의 번호 선택해주세요. > ");
		
		
		
		// 영수증 출력
		System.out.println(storeName);
		System.out.println(receiptOutline);
		System.out.println(receiptOutline);
		System.out.println("제품명\t|단가\t|수량\t|계");
		System.out.println(receiptOutline);
		System.out.println(customerOrder);
		System.out.println(receiptOutline);
		System.out.println(receiptOutline);
		System.out.println("\t\t합계 : " + total);
		
	}

}