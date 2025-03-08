package week02.collection;

import java.util.*;

public class ColHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colType = sc.nextLine();
        String title = sc.nextLine();

        switch (colType) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    String str = sc.nextLine();
                    if (Objects.equals(str, "끝")) {
                        break;
                    }
                    strList.add(str);
                }
                title = "[ List 로 저장된 " + title + " ]";
                System.out.println(title);
                for (int i=0; i<strList.size(); i++) {
                    int num = i+1;
                    System.out.println(num + ". " + strList.get(i));
                }
                break;
            case "Set":
                LinkedList<String> strSet = new LinkedList<>();
                while (true) {
                    String str = sc.nextLine();
                    if (Objects.equals(str, "끝")) {
                        break;
                    }
                    strSet.add(str);
                }
                title = "[ Set 로 저장된 " + title + " ]";
                System.out.println(title);
                for (int i=0; i<strSet.size(); i++) {
                    int num = i+1;
                    System.out.println(num + ". " + strSet.get(i));
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int num = 1;
                while (true) {
                    String str = sc.nextLine();
                    if (Objects.equals(str, "끝")) {
                        break;
                    }
                    strMap.put(num++, str);
                }
                title = "[ Map 로 저장된 " + title + " ]";
                System.out.println(title);
                for (int i=0; i<strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i+1));
                }
                break;
            default:
                System.out.println("리스트에 없는 자료구조.");
                break;
        }
    }
}
