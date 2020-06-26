package env;

public class BoardConnection {

	//멤버변수
	private String user; // 계정 아이디
	private String pass; // 계정 패스워드
	private String dirver; // DB연결 드라이버
	private String url; // DB연결 url
	
	//getter/setter
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDirver() {
		return dirver;
	}
	public void setDirver(String dirver) {
		this.dirver = dirver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
