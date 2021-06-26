package assignment.t2012e;

import assignment.t2012e.view.MainMenu;

public class T2012EApplication {
    public static void main(String[] args) {
//        StudentMenu menu = new StudentMenu();
//        menu.generateStudentMenu();
//        TeacherMenu menu = new TeacherMenu();
//        menu.generateTeacherMenu();
        MainMenu menu = new MainMenu();
        menu.generateMainMenu();
//        ArrayList<Student> listStudent = new ArrayList<Student>();
        // cho người dùng chọn số lượng sv muốn nhập.
        // sau khi nhập đủ số sinh viên.
        // yêu cầu ng dùng nhập rollNumber sinh viên cần tìm kiếm.
        // nếu tìm được thì in đầy đủ thông tin sv.
        // nếu không thì báo không tìm thấy.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of student: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < number; i++) {
//            Student student = new Student();
//            System.out.printf("Please enter student %d roll number: ", i + 1);
//            String rollNumber = scanner.nextLine();
//            student.setRollNumber(rollNumber);
//            System.out.printf("Please enter student %d full name: ", i + 1);
//            String fullName = scanner.nextLine();
//            student.setFullName(fullName);
//            System.out.printf("Please enter student %d email: ", i + 1);
//            String email = scanner.nextLine();
//            student.setEmail(email);
//            System.out.printf("Please enter student %d phone: ", i + 1);
//            String phone = scanner.nextLine();
//            student.setPhone(phone);
//            listStudent.add(student);
//        }
//        System.out.println("Enter student rollnumber to search: ");
//        String rollNumber = scanner.nextLine();
//        int tag = -1;
//        for (int i = 0; i < listStudent.size(); i++) {
//            Student student = listStudent.get(i);
//            if (student.getRollNumber().equals(rollNumber)) {
//                tag = i;
//            }
//        }
//        if (tag == -1){
//            System.err.println("No student found");
//        }else
//            System.out.println(listStudent.get(tag).toString());

    }
}
