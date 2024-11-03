import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        String config_location = "in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_location);
        Student std = (Student) context.getBean("stdId");
        std.display();
        System.out.println("--------------------------------------------------");
        Student std2 = (Student) context.getBean("stdId2");
        std2.display();
    }
}