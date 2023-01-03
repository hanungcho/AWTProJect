package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() {
		
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public int findBynameAndpw(String name,String pw ) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("select * from coffeemember where name = ? and pw = ?");
			
			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return 1;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int save(Member user) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into User values(coffeemember_seq.nextval, ?,?,?,?,?, sysdate)");
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getId());
			pstmt.setString(3, user.getPw());
			pstmt.setString(5, user.getEmail());
			pstmt.setString(6, user.getPhone());
			pstmt.setString(7, user.getBirth());
			pstmt.setString(7, user.getGender());
			return 1;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public Vector<Member> findByAll() {
		conn = DBConnection.getConnection();
		Vector<Member> users = new Vector<>();
		try {
			pstmt = conn.prepareStatement("select * from coffeemember");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member user = new Member();
				user.setName(rs.getString("name"));
				user.setId(rs.getString("id"));
				user.setPw(rs.getString("pw"));
				user.setgender(rs.getString("gender"));
				user.setEmail(rs.getString("Email"));
				user.setphonenumber(rs.getString("phonenumber"));
				user.setBirth(rs.getString("birth"));
				
				
			}
			return users;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
