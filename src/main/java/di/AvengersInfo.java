package di;

public class AvengersInfo {

	// 멤버변수 : 객체를 가지고 있음.
	private AvengersVO avengers;
	
	//인자생성자
	public AvengersInfo(AvengersVO avengers) {
		this.avengers = avengers;
	}
	
	//게터/세터
	public AvengersVO getAvengers() {
		return avengers;
	}
	public void setAvengers(AvengersVO avengers) {
		this.avengers = avengers;
	}
	
	public String AvengersView() {
		
		String returnStr = "";
		if(avengers != null) {
			returnStr += String.format("본명:%s<br/>", avengers.getName());
			returnStr += String.format("히어로명:%s<br/>", avengers.getHeroName());
			returnStr += String.format("능력:%s<br/>", avengers.getAbility());
			returnStr += String.format("나이:%s<br/>", avengers.getAge());
		}
		
		return returnStr;
	}
	
	
}
