import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 사용자에게 id, pw, 이름, 이메일
        Scanner sc = new Scanner(System.in);
        NaverDTO dto = new NaverDTO();
        System.out.println("ID");
        dto.setUserId(sc.nextLine());
        System.out.println("PW");
        dto.setUserPw(sc.nextLine());
        System.out.println("이름");
        dto.setUserName(sc.nextLine());
        System.out.println("이메일");
        dto.setEmail(sc.nextLine());
        
        // db 연결
        DBClass.connectDB();
        // 데이터 저장
        // DBClass.saveDB(dto);
        // 데이터 조회
        List<NaverDTO> resultDto = DBClass.selectDB();
        for(NaverDTO item : resultDto){
            System.out.println("아이디 : " + item.getUserId());
            System.out.println("비밀번호 : " + item.getUserPw());
            System.out.println("이름 : " + item.getUserName());
            System.out.println("이메일 : " + item.getEmail());
            System.out.println();
        }
        // 데이터 수정
        // 데이터 삭제
    }
}
