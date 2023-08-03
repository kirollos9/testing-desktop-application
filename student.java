package phaseone;

public class student {
	public String student_name;
	public String student_number;
	public int student_activities_mark;
	public int student_oral_practical_mark;
	public int student_mid_mark;
	public int student_final_mark;
	public String gpa;
	public int grade;
	public double gpa_number;
	private double avg;
	public void split(String str){
		String S[]=str.split(",",6);
		student_name= S[0];
		student_number=S[1];
		student_activities_mark=Integer.parseInt(S[2]);
		student_oral_practical_mark=Integer.parseInt(S[3]);
		student_mid_mark=Integer.parseInt(S[4]);
		student_final_mark=Integer.parseInt(S[5]);
		
	} 
    public boolean gpa_calculate(){
    	
    	avg=student_final_mark+student_mid_mark+student_activities_mark+student_oral_practical_mark;
       if(avg<0||avg>100){
    	   gpa_number=-1;
    	   return false;
    	  
       }
       else{
    	   	if(avg>=97 && avg<=100)
    	   	{
    	         gpa="A+";
    	         gpa_number=4;
    	    }
    	      else if(avg>=93 && avg<97){
    	    	  gpa="A";
     	         gpa_number=4;
    	      }
    	        
    	      else if(avg>=89 && avg<93)
    	      {
    	    	  gpa="A-";
     	         gpa_number=3.7;  
    	      }
    	       
    	      else if(avg>=84 && avg<89)
    	      {
    	    	  gpa="B+";
     	         gpa_number=3.3;
    	      }
    	         
    	      else if(avg>=80 && avg<84)
    	      {
    	    	  gpa="B";
     	         gpa_number=3;
    	      }
    	         
    	      else if(avg>=76 && avg<80)
    	      {
    	    	  gpa="B-";
     	         gpa_number=2.7;
    	      }
    	        
    	      else if(avg>=73 && avg<76)
    	      {
    	    	  gpa="C+";
     	         gpa_number=2.3;
    	      }
    	         
    	      else if(avg>=70 && avg<73)
    	      {
    	    	  gpa="C";
     	         gpa_number=2;
    	      }
    	       
    	      else if(avg>=67 && avg<70)
    	      {
    	    	  gpa="C-";
     	         gpa_number=1.7; 
    	      }
    	         
    	      else if(avg>=64 && avg<67)
    	      {
    	    	  gpa="D+";
     	         gpa_number=1.3;
    	      }
    	        
    	      else if(avg>=60 && avg<64)
    	      {
    	    	  gpa="D";
     	         gpa_number=1;
    	      }
    	        
    	      else
    	      {
    	    	  gpa="F";
     	         gpa_number=0;
    	      }
    	       
    	   	return true;
       }
    	
    }
    
    public boolean check_Student_name(String name){
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
    
    public boolean check_student_number(String number){
    	char ch;
    	if(number.length()!=8){
    		return false;
    	}
    	
    	else{
    		ch=number.charAt(0);
    		if(!(Character.isDigit(ch))){
    			return false;
    		}
    		else{
    			for(int i=1;i<number.length();i++){
    				ch=number.charAt(i);
    				if(Character.isDigit(ch)||Character.isAlphabetic(ch)){
    					continue;
    				}
    				return false;
    			}
    			if(Character.isAlphabetic(number.charAt(7))){
    				if(Character.isAlphabetic(number.charAt(6))){
    					return false;
    				}
    				
    			}
    			return true;
    			}
    		}
    		
    	}
    public boolean check_student_activities_mark(int grade){
    	if(grade<0||grade>10){
    		return false;
    		
    	}
    	else{
    		return true;
    	}
    	
    }
    public boolean check_student_oral_practical_mark(int grade){
    	if(grade<0||grade>10){
    		return false;
    		
    	}
    	else{
    		return true;
    	}
    	
    }
    public boolean check_student_mid_mark(int grade){
    	if(grade<0||grade>20){
    		return false;
    		
    	}
    	else{
    		return true;
    	}
    	
    }
    public boolean check_student_final_mark(int grade){
    	if(grade<0||grade>60){
    		return false;
    		
    	}
    	else{
    		return true;
    	}
    	
    }
    public boolean check_student(){
    	boolean s[];
    	s=new boolean[7];
    	s[0]=check_Student_name(student_name);
    	s[1]=check_student_number(student_number);
    	s[2]=gpa_calculate();
    	s[3]=check_student_activities_mark(student_activities_mark);
    	s[4]=check_student_oral_practical_mark(student_oral_practical_mark);
    	s[5]=check_student_mid_mark(student_mid_mark);
    	s[6]=check_student_final_mark(student_final_mark);
		for(int i=0;i<7;i++){
			if(s[i]==true){
				continue;
			}
			return false;
		}
		return true;
    	
    	
    }
    
   
}
