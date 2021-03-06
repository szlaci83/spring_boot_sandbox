package me.laszloszoboszlai.springboot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Bussiness service
@Service
public class StudentService {
	private  List<Student> students = new ArrayList<> (Arrays.asList(
			new Student(1,"Bob","Dylan","dylan@gmail.com"),
			new Student(2,"Frank","Sinatra","frank@yahoo.com"),
			new Student(3,"Alice","Cooper","alice@gmail.com")
			));
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	public Student getStudent(int id){
		return students.stream().filter(t -> t.getId()==id).findFirst().get();
	}

	public void addStudent(Student student) {
		students.add(student);	
	}

	public void updateStudent(int id, Student student) {
		for (int i=0; i<students.size(); i++){
			Student s = students.get(i);
			if(s.getId()==id){
				students.set(i, student);
				return;
			}
		}
		
	}

	public void deleteStudent(int id) {
		students.removeIf(t -> t.getId()==id);
		
	}
};
