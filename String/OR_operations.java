package String;

public class OR_operations {
    public static String ORoperation(String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1' || b.charAt(i) == '1') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "010101";
        String b = "101010";
        String res = ORoperation(a, b);
        System.out.println(res);
    }
}
