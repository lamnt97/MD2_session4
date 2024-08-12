public class Student {
    public String studentName;
    public String studentCode;
    public String studentAddress;
    public Integer age;
    public boolean sex;

    public Student(){

    }

    public Student(String studentName,String studentCode,String studentAddress,Integer age,boolean sex){
        this.studentName = studentName;
        this.studentCode = studentCode;
        this.studentAddress = studentAddress;
        this.age = age;
        this.sex = sex;
    }

    public void showIn4(){
        System.out.println("Sinh viên tên là "+this.studentName);
        System.out.println("Mã Sinh viên tên là "+this.studentCode);
        System.out.println("Tuổi Sinh viên tên là "+this.age);
        System.out.println("Giói tính" +(this.sex ? "Nam" : "Nữ"));
    }
}

