package problem02;

public class MyService extends BaseService {
	
	//System.out.println(state);
	
	public void service(String state) {
		//String result = state.equals("낮") ? day() : night() ;
		//System.out.println(result);
		System.out.println(state);
		if(state.equals("낮")) {
			day();
		}
		else if(state.equals("밤")) {
			night();
		}
		else {
			afternoon();
		}
	}	
	public String afternoon() {
		//return null;
		return "오후서비스시작";
	}
	
	public String day() {
		return "낮서비스시작";
	}	
	
	public String night() {
		/*
		 * if(state.equals("오후")) { afternoon(); }
		 */
		return "밤서비스시작";
	}	
}
