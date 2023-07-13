package ch00;

import java.util.Optional;

public class Study10 {
    public static void main(String[] args) {

        String str = null;
        
        // null 값이 들어올 수 있으니 처리 필요
        if(str == null){
            System.out.println("데이터가 null");
        } else {
            System.out.println(str.length());
        }
        

        // null 값이 들어올 수 있는 변수를 컨트롤 할 때 사용
        // null 처리 강제
        Optional<String> optionalStr = Optional.of("asdf");
        if(optionalStr.isEmpty()){
            System.out.println("데이터가 null");
        } else { 
            System.out.println("optionalStr.get().length() : " + optionalStr.get().length());
        }

        System.out.println(optionalStr.orElse("값이 없습니다"));
    }
}
