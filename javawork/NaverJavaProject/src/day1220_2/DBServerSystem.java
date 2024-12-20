package day1220_2;


public class DBServerSystem {
	// 접근 지정자를 우선 default로 해보고 protected로도 수정해보자
	protected String dbServerName;
	int serverPort;
	
	// 어느 생성자를 호출하냐에 따라 서버명이나 포트번호가 다르게 셋팅됨
	public DBServerSystem() {
		dbServerName = "Oracle";
		serverPort = 8080;
	}
	
	public DBServerSystem(String dbServerName) {
		this.dbServerName = dbServerName;
		this.serverPort = 8080;
	}
	
	public DBServerSystem(String dbServerName, int serverPort) {
		this.dbServerName = dbServerName;
		this.serverPort = serverPort;
	}
	
	public void serverStart() {
		System.out.println(serverPort+"Port로"+dbServerName+" DB 셋팅 완료");
	}
	
	public void serverclose() {
		System.out.println(dbServerName+" Db Close");
	}

}
