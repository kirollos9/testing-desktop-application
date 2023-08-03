package phaseone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class readclass {

	public static void main(String[] args) throws IOException {
		int flag =0;
		File file=new File("E:\\senior2\\testing\\project\\testing.txt");//write here the path of the loction of the input file and don't forget to make \\ not \
		FileWriter filew=new FileWriter("E:\\senior2\\testing\\project\\out.txt");
		Vector<String> vectStr = new Vector<String>();
		read(file,vectStr);
		int file_size;
		file_size=vectStr.size();
		student students[]=new student[file_size-1];
		subject sub=new subject();
		sub.split(vectStr.get(0));
		if(sub.check_subject()==false){
			System.out.println("wrong in subject information ");
			flag=1;
		}
		for(int i=0;i<file_size-1;i++){
			students[i]=new student();
		}
		for(int i=0;i<file_size-1;i++){
			students[i].split(vectStr.get(i+1));
		}
		for(int i=0;i<file_size-1;i++){
			students[i].gpa_calculate();
		}
		for(int i=0;i<file_size-1;i++){
			if(students[i].check_student()==true){
				continue;
				
			}
			System.out.println("wrong in student information ");
			flag=1;
			break;	
		}
		if(flag==0){
			write(filew,students,sub,file_size);
		}
				
	
	}
	public static void read(File file,Vector<String> vectStr) throws FileNotFoundException{
		Scanner scan=new Scanner(file);
		String s;
		while(scan.hasNextLine())
		{
		s =scan.nextLine();
		vectStr.add(s); 
		}
		scan.close();
		
	}
	public static void write(FileWriter filew,student students[],subject sub,int file_size) throws IOException{
		
		filew.write("Subject Name: "+sub.subject_name+" Max Marks: "+sub.full_mark+"\n");
		filew.write("Student name Student number GPA Grade\n");
		for(int i=0;i<file_size-1;i++){
		filew.write(students[i].student_name+" "+students[i].student_number+" "+students[i].gpa_number+" "+students[i].gpa+"\n");
		}
		filew.close();
	}

}
