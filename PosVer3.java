package Receipt;

import java.util.Scanner;

public class PosVer3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		// store 이름
		String storeName = "비트 편의점";
		
		// 상품 정보
		String[][] result = {{"생수", "900"}, {"쌀과자", "2300"}, {"껌", "500"}, {"커피", "1200"}};
		
		
		// 주문 정보 저장
		String customerOrder = "";
		
		// 주문 정보에 따른 합계
		int total = 0;
		
		// 레이아웃
		String orderOutline = "---------------------------------------------";
		String receiptOutline = "-----------------------------";
		// System.out.println(result.length);
		
		// 주문
		while (run) {
			System.out.println(storeName);
			System.out.println(orderOutline);
			System.out.println(orderOutline);
			System.out.println("0."+result[0][0]+" 1."+result[1][0]+" 2."+result[2][0]+" 3."+result[3][0]+" 4.선택 종료");
			System.out.println("원하시는 상품의 번호 선택해주세요. > ");
			
			int choice = scanner.nextInt();
			
			if( choice > result.length ) {
				break;
			}
			
			System.out.println();
			
			System.out.println("수량을 입력해주세요. > ");
				
			int num1 = scanner.nextInt();

			customerOrder += result[choice][0] + "\t" + result[choice][1] + "\t" + num1 + "\t" + (num1 * Integer.parseInt(result[choice][1])) + "\n";
				
			total += num1 * Integer.parseInt(result[choice][1]);
		}
		
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