package phaseone;

public class subject {
	public String subject_name;
	public String subject_code;
	public int full_mark;
	public void split(String str){
		String S[]=str.split(",",3);
		subject_name= S[0];
		subject_code=S[1];
		full_mark=Integer.parseInt(S[2]);
		
	} 
	public boolean check_subject_full_mark(int full){
		/*first we check the full mark */
		if(full!=100){
			System.out.println("error in full mark should be 100");
			return false;
		}
		else{
			return true;
		}
	}
	public boolean check_subject_name(String name){
		if(name.charAt(0)==' '){
			return false;
		}
		for(int i=0;i<name.length();i++){
		    char ch = name.charAt(i);
		    if (Character.isLetter(ch) || ch == ' ') {
		      continue;
		    }
		    return false;
		  }
		  return true;
	}
	public boolean check_subject_code(String code){
		char ch;
		if(code.length()!=6 && code.length()!=7){
			return false;
		}
		
		for(int i=0;i<3;i++){
			 ch=code.charAt(i);
			if(Character.isLetter(ch)){
				continue;
			}
			return false;
		}
		for(int i=3;i<6;i++){
			 ch=code.charAt(i);
				if(Character.isDigit(ch)){
					continue;
				}
				return false;
		}
		if(code.length()==7){
			if(code.charAt(6)!='s'){
				return false;
			}
		}
		return true;
	}
	public boolean check_subject(){
		boolean s[];
    	s=new boolean[3];
    	s[0]=check_subject_name(subject_name);
    	s[1]=check_subject_code(subject_code);
    	s[2]=check_subject_full_mark(full_mark);
    	for(int i=0;i<3;i++){
			if(s[i]==true){
				continue;
			}
			return false;
		}
		return true;
	}

}
