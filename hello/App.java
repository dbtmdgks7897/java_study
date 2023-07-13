package hello;

// import java.util.ArrayList;
// import java.util.Scanner;

// import java.awt.Desktop;
import java.util.List;
// import java.io.IOException;
// import java.net.URI;
// import java.net.URISyntaxException;

public class App {
    public static void main(String[] args) {

        MyClass mc = new MyClass();

        System.out.println("오점뭐");

        Menu menu = new MenuImpl();

        // 작성된 메뉴 출력
        List<String> fList = menu.printMenu();

        // 사용자의 입력
        String selectedMenu =  menu.select(fList);

        // 입력된 값에 따라 메뉴 출력
        menu.printSelectedMenu(fList, selectedMenu);



        // Scanner scanner = new Scanner(System.in);
        // String googleSearch = "https://www.google.com/search?q=";

        

        // // 메뉴 작성
        // List<String> foodList1 = new ArrayList<>();해
        // foodList1.add("햄버거");
        // foodList1.add("파스타");
        // foodList1.add("제육볶음");
        // foodList1.add("돈까스");
        // foodList1.add("김치찌개");

        // // 메뉴 출력
        // int idx = 1;
        // for (String item: foodList1){
        //     System.out.println(idx++ + ". " + menu);
        // }
        // System.out.println();
        // System.out.println("무작위로 추천 받으시고 싶다면 '랜덤'을 입력해주세요");

        // // 사용자에게 입력
        // // 메뉴 선택
        // System.out.printf("드시고 싶으신 메뉴를 입력해주세요 : ");
        // String selectedMenu = scanner.nextLine();

        // if(!foodList1.contains(selectedMenu)){
        //     if(!selectedMenu.equals("랜덤")){
        //         selectedMenu = foodList1.get(Integer.parseInt(selectedMenu)-1);
        //     }
        // }

        // // 아무거나 선택 기능
        // if(selectedMenu.equals("랜덤")){
        //     int randomIdx = (int)Math.random();
        //     selectedMenu = foodList1.get(randomIdx % foodList1.size());
        //     System.out.println("인공지능이 추천 하는 점심 : " + selectedMenu);
        // }

        // // 선택된 메뉴 출력
        // System.out.println("구글 링크 : " + googleSearch + selectedMenu);
        // try {
		// 	Desktop.getDesktop().browse(new URI(googleSearch + selectedMenu));
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// } catch (URISyntaxException e) {
		// 	e.printStackTrace();
		// }
    }
    
}
