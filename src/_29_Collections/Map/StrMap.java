package _29_Collections.Map;

import java.util.*;

public class StrMap {
    /*
    * Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
    * Key는 중복될 수 없고, value는 중복이 가능하다.
    * */

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        strMap1.put("kor2025001", "이동윤");
        strMap1.put("kor2025002", "이동윤");
        strMap1.put("kor2025003", "삼동윤");
        strMap1.put("kor2025004", "오동윤");
        strMap1.put("kor2025005", "육동윤");

        System.out.println(strMap1);

        //Map 순회
        //Map은 직접적으로 순회할 수 없다 => 직접 foreach를 돌릴 수 없다
        //왜냐하면 순회하기 위해서는 Iterable이라는 인터페이스를 구현한 클래스여야 하는데
        //Collection은 Iterable 인터페이스를 상속받고 Map이 이것으로 구현이 되어있어하는데
        //그렇지 않음
        //그럼에도 순회하려면 다른 방법을 사용해야함

        System.out.println(strMap1.keySet()); // => 키만 set형태로 반환
        System.out.println(strMap1.entrySet()); // => 키 값 전체를 set형태로 반환
        List<String> keyList = new ArrayList<>(strMap1.keySet());
        Collections.sort(keyList);
        for (String key : keyList) {
            System.out.println("키: " + key + ", 값: " + strMap1.get(key));
        }

        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println("[Entry]" + entry.getKey() + " => " + entry.getValue());
        }

        strMap1.put("kor2025005", "배찬익");
        System.out.println(strMap1);
        //Map의 특징 중 하나로 하나의 key에는 하나의 value만 가능
        //만약에 key가 동일하게 들어간다면 value값은 최신 것으로 덮어쓰기 된다.

        System.out.println(strMap1.get("kor2025005"));

        strMap1.replace("kor2025002", "박윤호");
        System.out.println(strMap1.get("kor2025002"));

        //특정 키의 존재 여부
        boolean searchKeyFlag1 = strMap1.containsKey("kor2025005");
        System.out.println(searchKeyFlag1);

        //특정 값의 존재 여부
        boolean searchValueFlag2 = strMap1.containsValue("심재원");
        System.out.println(searchValueFlag2);

        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>(strMap1.entrySet());
        System.out.println(entrySet1);
        List<Map.Entry<String, String>> entryList = new ArrayList<>(entrySet1);
        System.out.println(entryList);

        //Map 정렬 => 사실 불가능
        //Map은 빠른 탐색 및 검색을 위해 만들어진(설계된) 것
        //그래서 정렬은 고려하지 않고 만듦 => 그래서 순서도 보장하지 않는다
        //그럼에도 정렬할려면?
        Collections.sort(entryList, Map.Entry.comparingByValue()); //값기준 정렬
        System.out.println("값 기준 정렬: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByKey()); //키기준 정렬
        System.out.println("키 기준 정렬: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키 기준 내림차순 정렬: " + entryList);
    }
}











