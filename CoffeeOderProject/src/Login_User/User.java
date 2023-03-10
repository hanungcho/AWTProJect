package Login_User;

import java.security.Timestamp;

public class User {
	private String name;
	private String id;
	private String pw;
	private String gender;
	private String email;
	private String ponenumber;
	private String birth;
	
	public User() {
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String gender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPonenumber() {
		return ponenumber;
	}

	public void setPonenumber(String ponenumber) {
		this.ponenumber = ponenumber;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", ponenumber=" + ponenumber + ", birth=" + birth + "]";
	}
}

