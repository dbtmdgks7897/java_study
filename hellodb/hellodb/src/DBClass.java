import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBClass {
    private static final String DB_DRIVER_CLASS = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://127.0.0.1:3306/hello";
    private static final String DB_USERNAME = "hello";
    private static final String DB_PASSWORD = "hello1";
    private static Connection conn;

    PreparedStatement pstmt = null;
    // DB 연결
    public static void connectDB() {
        try {
            Class.forName(DB_DRIVER_CLASS);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("연결성공");
        } catch (ClassNotFoundException e) {
            System.out.println("실 패");
        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
        }
    }

    public static void saveDB(NaverDTO dto) {
		PreparedStatement pstmt = null;

		try {
			// Insert문 ?부분은 아래의 입력값이 자동으로 변환이 됩니다.
			String sql = "INSERT INTO `naver` (`userid`, `userpw`, `name`, `email`) VALUES (?, ?, ?, ?); ";
			pstmt = conn.prepareStatement(sql);

			int index = 1;
			// Insert 데이터값
			pstmt.setString(index++, dto.getUserId());
			pstmt.setString(index++, dto.getUserPw());
			pstmt.setString(index++, dto.getUserName());
			pstmt.setString(index++, dto.getEmail());

			// SQL실행
			int count = pstmt.executeUpdate();

			if (count == 0) {
				System.out.println("데이터값에 이상이 있습니다.");
			} else {
				System.out.println("데이터 Insert 성공!");
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void selectDB() {
		PreparedStatement pstmt = null;
    	ResultSet rs = null;

		try {
			// Select 쿼리문
			String sql = "SELECT * FROM naver";
			// 객체 생성
			pstmt = conn.prepareStatement(sql);
			// SQL실행
			rs = pstmt.executeQuery();

			// 결과값 출력
			while (rs.next()) {
				String userid = rs.getString("userid");
				String userpw = rs.getString("userpw");
				String name = rs.getString("name");
				String email = rs.getString("email");

				System.out.println("아이디 : " + userid);
				System.out.println("비밀번호 : " + userpw);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
