package string_ex;

public class StringEx {
    public static void main(String[] args) {
        //문자열 생성 방법
        String str1 = "hello";//약식 문법
        String str2 = new String("hello");//정식 문법
        //문자배열로 생성
        char ch[] = {'h', 'e', 'l', 'l', 'o' };
        String str3 = new String(ch);
        //StringBuffer를 사용하여 문자열 생성.
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        sb.append("def");
        String str4 = new String(sb);
        String str5 = sb.toString();

        /////////////////////////////////////////
        System.out.println(str1.concat("world"));

        char c = str1.charAt(3);
        System.out.println(c);

        char carr[] = new char[str1.length()];
        for(int i = 0; i <str1.length(); i++){
            carr[i] = str1.charAt(i);
        }
        for (char ci : carr) {
            System.out.println(ci);
        }
        //System.out.println(carr);
        String str6 = "dog,cat:chicken-pig rabbit";
        String strs[] = str6.split("[ ,:-]");//정규식
        for(String s : strs){
            System.out.println(s);
        }

        String str7 = "aaaa0bbbbdfss5ggg";
        String str8 = str7.replace("aa", "AA");
        System.out.println(str7);
        System.out.println(str8);

        System.out.println(str7.indexOf("ss" ,1));

        String str9 = str7.substring(str7.indexOf("ss"),11);
        System.out.println(str7);
        System.out.println(str9);
    }
}//class end
