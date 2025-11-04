package _32_LayeredArchitecture2;

import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.service.SignupService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[회원관리 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print(" >> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중...");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignupReqDto signupReqDto = new SignupReqDto();
                while (true) {
                    System.out.print("Username: ");
                    signupReqDto.setUsername(scanner.nextLine());
                    //아이디 중복확인
                    if (signupService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 Username입니다.");
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    signupReqDto.setPassword(scanner.nextLine());
                    //비밀번호 유효성 체크
                    if (signupService.isValidPassword(signupReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
                }
                //비밀번호와 비밀번호 확인 같은지 체크
                while (true) {
                    System.out.print("비밀번호 확인: ");
                    signupReqDto.setConfirmPassword(scanner.nextLine());
                    if (signupService.isValidConfirmPassword(signupReqDto.getPassword(), signupReqDto.getConfirmPassword())){
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
                }

                signupService.signup(signupReqDto);
                System.out.println("[[ 회원가입 완료 ]]");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
            } else {
                System.out.println("메뉴를 다시 선택해주세요.");
            }
        }

        System.out.println("프로그램 종료 완료");
    }
}
