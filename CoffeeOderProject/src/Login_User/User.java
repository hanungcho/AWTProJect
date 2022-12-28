package Login_User;

import java.security.Timestamp;

public class User {
	private String name;
	private String id;
	private String pw;
	private String nickname;
	private String email;
	private String ponenumber;
	private String birth;
	private Timestamp createDate;
	
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


	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", nickname=" + nickname + ", email=" + email
				+ ", ponenumber=" + ponenumber + ", birth=" + birth + ", createDate=" + createDate + "]";
	}
}

