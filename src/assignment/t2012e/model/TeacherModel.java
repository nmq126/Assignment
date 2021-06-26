package assignment.t2012e.model;

import assignment.t2012e.entity.Teacher;

import java.util.ArrayList;

public class TeacherModel {
    private ArrayList<Teacher> list;

    {
        list = new ArrayList<>();
        list.add(new Teacher("A001", "Hung", "h@gmail.com", "0912313283"));
        list.add(new Teacher("A002", "Hero", "hero@gmail.com", "091645327"));
        list.add(new Teacher("A003", "Luyen", "l@gmail.com", "0913567353"));
        list.add(new Teacher("A004", "gnuh", "g@gmail.com", "0864678953"));
        list.add(new Teacher("A005", "oreh", "o@gmail.com", "06573434543"));
        list.add(new Teacher("A006", "neyul", "n@gmail.com", "0123537656"));
    }

    public boolean save(Teacher obj) {
        list.add(obj);
        return true;
    }

    public ArrayList<Teacher> findAll() {
        return list;
    }

    public Teacher findById(String id) {
        Teacher obj = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollNumber().equals(id)) {
                obj = list.get(i);
                break;
            }
        }
        return obj;
    }

    public boolean update(String id, Teacher updateObj) {
        Teacher existingTeacher = findById(id);
        if (existingTeacher == null) {
            return false;
        }
        existingTeacher.setFullName(updateObj.getFullName());
        existingTeacher.setEmail(updateObj.getEmail());
        existingTeacher.setPhone(updateObj.getPhone());
        return true;
    }

    public boolean delete(String id) {
        Teacher existingTeacher = findById(id);
        if (existingTeacher == null) {
            return false;
        }
        list.remove(existingTeacher);
        return true;
    }
}
