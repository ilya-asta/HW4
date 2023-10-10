import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

import static java.lang.System.exit;

public class TeacherView<T extends Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    public void sendOnConsole(List<Teacher> teacher) {
        for(Teacher user: teacher){
            logger.info(user.toString());
        }
    }
    public void ViewApp () {
        TeacherController controller = new TeacherController(new TeacherGroup(), new TeacherService());

        while (true) {
            System.out.println("\nДля управления наберите число \n1 - добавление учителя \n2 - редактирование учителя \n3 - удаление учителя \n4 - выход из программы");
            System.out.print("Введите номер -> ");
            Scanner i = new Scanner(System.in);
            String action = i.next();

            if (Objects.equals(action, "1")) {
                controller.addNewTeacher();
                continue;
            }

            if (Objects.equals(action, "2")) {
                controller.upgradeTeacher();
                continue;
            }

            if (Objects.equals(action, "3")) {
                controller.removeTeacher();
                continue;
            }

            if (Objects.equals(action, "4")) {
                exit(0);
            }
        }
    }
}
