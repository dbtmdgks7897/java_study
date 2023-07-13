package hello;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuImpl implements Menu{

    @Override
    public List<String> printMenu() {
        List<String> foodList1 = new ArrayList<>();
        foodList1.add("햄버거");
        foodList1.add("파스타");
        foodList1.add("제육볶음");
        foodList1.add("돈까스");
        foodList1.add("김치찌개");

        int idx = 1;
        for (String menu: foodList1){
            System.out.println(idx++ + ". " + menu);
        }
        System.out.println();
        System.out.println("무작위로 추천 받으시고 싶다면 '랜덤'을 입력해주세요");
        return foodList1;
    }

    @Override
    public String select(List<String> foodList1) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("드시고 싶으신 메뉴를 입력해주세요 : ");
        String selectedMenu = scanner.nextLine();

        if(!foodList1.contains(selectedMenu)){
            if(!selectedMenu.equals("랜덤")){
                selectedMenu = foodList1.get(Integer.parseInt(selectedMenu)-1);
            }
        }
        scanner.close();
        return selectedMenu;
    }

    @Override
    public void printSelectedMenu(List<String> foodList1, String selectedMenu) {
        
        if(selectedMenu.equals("랜덤")){
            int randomIdx = (int)Math.random() * 10;
            selectedMenu = foodList1.get(randomIdx % foodList1.size());
            System.out.println("인공지능이 추천 하는 점심 : " + selectedMenu);
        }

        String googleSearch = "https://www.google.com/search?q=";

        // 선택된 메뉴 출력w
        System.out.println("구글 링크 : " + googleSearch + "주위+" + selectedMenu + "+맛집");
        try {
			Desktop.getDesktop().browse(new URI(googleSearch + "주위+" + selectedMenu + "+맛집"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

        
    }
}
