package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        //변수명 짓는 법
        /*
        * 1. 저장되는 데이터에 어울리는 이름, 즉 직관적이고 한눈에 파악가능할 이름
        * 2. 밑줄(_), 문자, 숫자 사용가능 (공백 사용 불가), 숫자가 맨 처음 올 수 없다
        * 3. 밑줄 또는 문자로 시작가능
        * 4. 한 단어 또는 2개 이상 단어의 연속
        * 5. 소문자로 시작하고, 두번째 단어부터 시작글자를 대문자
        * 6. 예약어 사용불가 (public, static, void, int, double, float, ...)
        * */

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carEnginType = "electric";
        String carColor = "red";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        //boolean
        boolean isEmpty = false;

        //상수
        final String COUNTRY_CODE = "KR";

        //생년월일 => 상수 선언
        //이름 => 변수 선언

        /*
        * 제 이름은 *** 입니다. 생년월일은 *** 입니다.
        * */
        final String BIRTH_YEAR_MONTH_DAY = "19990226";
        String name = "이동윤";
        System.out.println("제 이름은 " + name + " 입니다. 생년월일은 " + BIRTH_YEAR_MONTH_DAY + " 입니다.");

    }
}
