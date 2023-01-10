package DB;

import java.util.Date;

public class Member {
	public static final int GENDER_MALE = 1;
	public static final int GENDER_FEMALE = 2;
	
	private int id;
	private String name;
	private String login;
	private String pw;
	private String email;
	private String phone;
	private String birth;
	private int gender;
	
	public Member() {
	}
	// 아이디 찾기용	
		public Member(String name) {
			this.name = name;
		}

		
		
//	// 중간 생성자
//		public Member(String login, String pw, String name, int gender, String birth, String phone, String email) {
//		      this(0, login, pw, name, gender, birth, phone, email);
//		   }
	
	
	public Member(String name, String login, String pw,  String email, String phone, String birth,int gender) {
		super();
		this.name = name;
		this.login = login;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
		this.birth = birth;
		this.gender = gender;
	}
	
	

	public Member(int id, String name, String login, String pw,  String email, String phone, String birth,int gender) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.pw = pw;
		this.gender = gender;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", login=" + login + ", pw=" + pw + ", email=" + email + 
				", phone=" + phone + ", birth=" + birth +", gender=" + gender+ "]";
	}
	
	
	
	
	
	
}