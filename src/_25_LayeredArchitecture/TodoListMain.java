package _25_LayeredArchitecture;

import _25_LayeredArchitecture.repository.TodoList;
import _25_LayeredArchitecture.repository.UserList;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;
import _25_LayeredArchitecture.view.TodoListView;

import java.time.LocalDateTime;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        TodoList todoList = new TodoList();
        UserService userService = new UserService(userList);
        TodoService todoService = new TodoService(todoList);
        TodoListView view = new TodoListView(userService, todoService);
        view.homeView();
    }
}
