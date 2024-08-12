public class Program {
    public static void main(String[] args) {
        //Khởi tạo đối tượng student1 từ class Student
        Student student1 = new Student();
        //Khởi tạo đối tượng student2 từ class Student
        Student student2 = new Student("lâm","123","Hà nội",22,true);

        // Truy cập vào thuộc tính và phương thức của đối tượng
        // objectName.property || objectName.methodName()

        student1.studentName = "Tăng Thảo";
        student1.studentCode = "999";
        student1.studentAddress = "HCM";
        student1.age = 22;
        student1.sex = false;

        student1.showIn4();
        student2.showIn4();

    }
}
