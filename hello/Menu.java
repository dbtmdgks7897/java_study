package hello;

import java.util.List;

public interface Menu {
    // 작성된 메뉴 출력
    public List<String> printMenu();

    // 사용자의 입력
    public String select(List<String> foodList1);
    
    // 입력된 값에 따라 메뉴 출력
    public void printSelectedMenu(List<String> foodList1, String selectedMenu);

    // 아무거나 ai로 출력
    // public String printAiMenu(List<String> foodList1, String selectedMenu);
}