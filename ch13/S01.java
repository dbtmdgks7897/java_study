package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S01 {
    public static void main(String[] args) {
        // 자바와 DB를 연결하는 객체
        Connection connection = null;

        // 3306까지가 데이터베이스 시스템 / hr 위치가 데이터베이스
        String url = "jdbc:mariadb://localhost:3306/hr";

        // 데이터베이스 연결
        try {
            connection = DriverManager.getConnection(
                url,
                "root",
                "1234"
            );
        } catch (SQLException e) {
            System.out.println("디비 연결 오류");
            return;
        }

        // 쿼리문 날리기
        String sql = "SELECT first_name FROM employees WHERE employee_id = ?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
        } catch (SQLException e) {
            System.out.println("디비 사용 중 오류");
        }

        ResultSet resultSet = null;

        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("쿼리 실행 중 오류 발생");
            System.out.println(e.getMessage());
            return;
        }


        // 데이터 자바로 변환
        try {
            if(resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (Exception e) {
            System.out.println("데이터 변환 중 오류");
        };
       



        try {
            // connection은 무조건 닫아줘야 함
            // null 체크
            if(connection != null){
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception e) {
            System.out.println("연결 종류 중 오류가 발생");
        }
    }
}
