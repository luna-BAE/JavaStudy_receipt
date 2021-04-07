package Receipt;

import java.util.Scanner;

public class PosVer2 {

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
		
		// 주문
		while (run) {
			System.out.println(storeName);
			System.out.println(orderOutline);
			System.out.println(orderOutline);
			System.out.println("1."+result[0][0]+" 2."+result[1][0]+" 3."+result[2][0]+" 4."+result[3][0]+" 5.선택 종료");
			System.out.println("원하시는 상품의 번호 선택해주세요. > ");
			
			int choice = scanner.nextInt();
			System.out.println();
			
			if(choice==1) {
				System.out.println("수량을 입력해주세요. > ");
				int num1 = scanner.nextInt();
				customerOrder += result[0][0] + "\t" + result[0][1] + "\t" + num1 + "\t" + 
				(num1 * Integer.parseInt(result[0][1])) + "\n";
				total += num1 * Integer.parseInt(result[0][1]);
			}
			
			if(choice==2) {
				System.out.println("수량을 입력해주세요. > ");
				int num2 = scanner.nextInt();
				customerOrder += result[1][0] + "\t" + result[1][1] + "\t" + num2 + "\t" + 
				(num2 * Integer.parseInt(result[1][1])) + "\n";
				total += num2 * Integer.parseInt(result[1][1]);
			}
			
			if(choice==3) {
				System.out.println("수량을 입력해주세요. > ");
				int num3 = scanner.nextInt();
				customerOrder += result[2][0] + "\t" + result[2][1] + "\t" + num3 + "\t" + 
				(num3 * Integer.parseInt(result[2][1])) + "\n";
				total += num3 * Integer.parseInt(result[2][1]);
			}
			
			if(choice==4) {
				System.out.println("수량을 입력해주세요. > ");
				int num4 = scanner.nextInt();
				customerOrder += result[3][0] + "\t" + result[3][1] + "\t" + num4 + "\t" + 
				(num4 * Integer.parseInt(result[3][1])) + "\n";
				total += num4 * Integer.parseInt(result[3][1]);
			}
			
			if(choice==5) {
				break;
			}

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
