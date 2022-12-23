import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class App {

    static int count = 0;
    static ArrayList<Task> arr;

    public static void main(String[] args) {

        arr = new ArrayList<>();

        System.out.print("Список команд:\n1 - Создать задание\n2 - Удалить задание \n3 - Отредактировать задание \n4 - Просмотреть список заданий\n");

        Date date = new Date();
        String strDate = String.format("%tD", date);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер команды: ");
            int com = in.nextInt();

            if (com==1) {
                System.out.print("Введите название нового задания: ");
                String title = in.next();
                GenerateNewTask(count, strDate, title);
                String crDate = arr.get(count).getDateCreate();
                String taskTitle = arr.get(count).getTitle();
                System.out.println("Задание "+taskTitle+" создано "+crDate);
                count++;
            } else if (com==2) {

            } else if (com==3) {

            } else if (com==4) {
                for (int j = 0; j < arr.size(); j++) {
                    String taskTitle = arr.get(j).getTitle();
                    String crDate = arr.get(j).getDateCreate();
                    System.out.println(taskTitle+" создано "+crDate);
                }

            }
             else {
                System.out.println("Неверная команда.");
            }

        }

    }

    public static void GenerateNewTask(int countt, String date, String titlet) {
        int i = countt;
        countt++;
        arr.add(i, new Task(countt, date, titlet));
    }
}
