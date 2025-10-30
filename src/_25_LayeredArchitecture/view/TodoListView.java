package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principal;
    private UserService userService;

    public TodoListView(UserService userService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
    }

    public void homeView() {
        while (true) {
            System.out.println("[ TodoList ]");
            System.out.println("1. TodoList 관리");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">>> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                //TodoList 관리
                if (principal == null) {
                    System.out.println("로그인 후 사용 가능합니다.");
                    continue;
                }
            } else if ("2".equals(cmd) && principal == null) {
                //회원가입
            } else if ("2".equals(cmd) && principal != null) {
                //로그아웃
            } else if ("3".equals(cmd) && principal == null) {
                //로그인
            } else {
                System.out.println("메뉴를 다시 선택해주세요.");
            }
        }
    }

    public void signupView() {
        System.out.println("[ 회원가입 ]");

        //중복확인
        String username = null;
        while (true) {
            System.out.print("username >> ");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) { //중복이 되지 않았을때
                System.out.println("사용 가능한 username 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username 입니다.");
        }

        System.out.print("password >> ");
        String password = scanner.nextLine();

        System.out.print("name >> ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
        //userService의 회원가입 로직에 signupReqDto 전달
    }
}











