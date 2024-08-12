public class PersonProgram {
    public static void main(String[] args) {
        Person person1 = new Person();
        //gián giá trị cho đối tượng person
        person1.setName("Trường Lâm");
        person1.setAge(20);
        person1.setSex(false);

        Person person2 = new Person("Lâm",true,27);
        //truy cập lấy ra tên của đổi tượng person
        System.out.println("Tên là " + person2.getName());
        System.out.println("Giới tính " + (person2.isSex() ? "Nam" : "Nữ"));
    }
}
