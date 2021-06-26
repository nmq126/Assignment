package assignment.t2012e.model;

import assignment.t2012e.entity.Student;

import java.util.ArrayList;

public class StudentModel {
    private ArrayList<Student> list;
    {
        list = new ArrayList<>();
        list.add(new Student("A001", "Quang", "q@gmail.com", "0912313283"));
        list.add(new Student("A002", "Nguyen", "n@gmail.com", "091645327"));
        list.add(new Student("A003", "Kien", "k@gmail.com", "0913567353"));
        list.add(new Student("A004", "Back", "b@gmail.com", "0864678953"));
        list.add(new Student("A005", "Dat", "d@gmail.com", "06573434543"));
        list.add(new Student("A006", "Kwang", "k@gmail.com", "0123537656"));
    }
    public boolean save(Student obj){
        list.add(obj);
        return true;
    }
    public ArrayList<Student> findAll(){
        return list;
    }
    public Student findById(String id){
        Student obj = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRollNumber().equals(id)){
                obj = list.get(i);
                break;
            }
        }
        return obj;
    }
    public boolean update(String id, Student updateObj){
        Student existingStudent = findById(id);
        if (existingStudent == null){
            return false;
        }
        existingStudent.setFullName(updateObj.getFullName());
        existingStudent.setEmail(updateObj.getEmail());
        existingStudent.setPhone(updateObj.getPhone());
        return true;
    }
    public boolean delete(String id){
        Student existingStudent = findById(id);
        if (existingStudent == null){
            return false;
        }
        list.remove(existingStudent);
        return true;
    }
}
