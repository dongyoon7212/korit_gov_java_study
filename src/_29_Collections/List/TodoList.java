package _29_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();

        System.out.print("할 일을 몇 개 입력하시겠습니까? :");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 할 일을 입력하세요: ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        System.out.print("포함 여부를 확인할 할 일을 입력하세요: ");
        String searchTodo = scanner.nextLine();
        boolean contains = todoList.contains(searchTodo);
        System.out.println("-> " + searchTodo + " 포함 여부: " + contains);

        System.out.print("삭제할 할 일을 입력하세요: ");
        String deleteTodo = scanner.nextLine();
        boolean removed = todoList.remove(deleteTodo);
        System.out.println("-> " + deleteTodo + " 삭제 성공 여부: " + removed);

        Collections.sort(todoList);
        System.out.println("[오름차순 정렬된 할 일 목록]");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("[내림차순 정렬된 할 일 목록]");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        System.out.println("총 할 일 수: " + todoList.size());
    }
}
