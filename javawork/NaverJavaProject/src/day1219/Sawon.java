package day1219;

public class Sawon {
	/*
	 * 멤버변수  사원명 sawonName,직급 position,
	 * 가족수 famSu
	 */
	private String sawonName;
	private String sawonPosition;
	private int sawonFamsu;

	/*
	 * 디폴트 생성자
	 * 사원명,직급,가족수 를 인자로 받는 생성자
	 */	
	public Sawon() {
		super(); // 있으나없으나 상관없
	}
	public Sawon(String sawonName, String sawonPosition, int sawonFamsu) {
		this.sawonName = sawonName;
		this.sawonPosition = sawonPosition;
		this.sawonFamsu = sawonFamsu;
	}

	/*setter & getter method */
	public String getSawonName() {
		return sawonName;
	}
	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}
	public String getSawonPosition() {
		return sawonPosition;
	}
	public void setSawonPosition(String sawonPosition) {
		this.sawonPosition = sawonPosition;
	}
	public int getSawonFamsu() {
		return sawonFamsu;
	}
	public void setSawonFamsu(int sawonFamsu) {
		this.sawonFamsu = sawonFamsu;
	}
	/*
	 *   직급에 따라 기본급을 구하는데  부장->450, 과장->300, 대리->250,사원->150
	 *   getGibonPay()
	 */
	public int getGibonPay() {
		int gb = switch(sawonPosition) { // 새로운 switch문법은 break;를 안써도됨!
		case "부장" -> 450;
		case "과장" -> 300;
		case "대리" -> 250;
		case "사원" -> 150;
		default -> 0;
		};
		return gb;// 케이스 별 설정한 기본급 반환(리턴)
	}
	/*
	 *  직급에 따라 수당을 구하는데  부장,과장->70, 대리,사원->50
	 *   getSudang()
	 */
	public int getSudang() {
		int sd = switch(sawonPosition) { 
		case "부장" -> 70;
		case "과장" -> 70;
		case "대리" -> 50;
		case "사원" -> 50;
		default -> 0;
		};
		return sd;	
	}
	/*
	 * getGibonPay() 값을 반환받아서 세금 5프로를 구해서 반환하는
	 * getTax()
	 */
	public int getTax() {
		int tax = getGibonPay()*5/100; // 형 변환을 안하고싶을 때
		return tax;		
		};

	/*
	 * 가족수가 5인 이상이면 30 반환,5인 미만 2인 이상은 10반환, 나머지는 0
	 * getFamSudang()
	 */
	public int sawonFamsudang() {
		int sawonFamsudang;
		if(sawonFamsu > 4) sawonFamsudang = 30;
			else if (sawonFamsu < 5 && sawonFamsu > 1) sawonFamsudang = 10;
			else sawonFamsudang = 0;
			return sawonFamsudang;
		}
	/*
	 * 실수령액을 구해서 반환하는 메서드 기본급+수당-세금+가족수당을 구해서 반환
	 * getNetPay()
	 */
	public int getNetPay() {
		return getGibonPay()+getSudang()-getTax()+sawonFamsudang();
	}

}
