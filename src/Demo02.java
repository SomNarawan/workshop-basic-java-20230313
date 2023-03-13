public class Demo02 {
    public static void main(String[] args) {
        // String
        String name1 = "Narawan"; // String Poll memory
        String name2 = new String("Narawan"); // Object memory

        // compare
        if(name2 == "Narawan") {
            System.out.println("OK 0"); // not == เพราะ memory คนละที่กัน ควรใช้ .equals
        }

        if ("Narawan".equals(name1)) {
            System.out.println("OK 1");
        }

        if ("Narawan".equals(name2)) {
            System.out.println("OK 2");
        }

        // ถ้าใช้ตัวแปร. จะมีโอกาสเกิด null exception ควรใช้ตัวที่ไม่เป็น null มานำหน้าก่อน
//        name1 = null;
        if (name1.equals("Narawan")) {
            System.out.println("OK 3");
        }

        // for
        for (int i = 0; i <name1.length() ; i++) {
            System.out.println(name1.charAt(i));
        }

        // int array
//        int[] scores = new int[5];
        int[] scores = new int[]{0, 10, 20, 30, 40};
//        scores[0] = 0;
//        scores[1] = 10;
//        scores[2] = 20;
//        scores[3] = 30;
//        scores[4] = 40;

        // for each
        for (int score: scores) {
            System.out.println(score);
        }

        // for i
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + " : " +scores[i]);
        }
    }
}
