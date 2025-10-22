public class DemoCodeKeywords {
    public static void main(String[] args) {
        int i = 0;

        if (i == 0) {
            System.out.println("i is zero");
        } else {
            System.out.println("i is not zero");
        }

        for (int j = 1; j < 10; j++) {
            System.out.println("j is " + j);
        }

        while (i < 3) {
            System.out.println("i is " + i);
            i++;
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
        }

        for (int k=0; k<5; k++){
            if (k==2) continue;
            if (k==4) break;
            System.out.println(k);
        }


        System.out.println("Is 4 Even?" + isEven(4));

    }

        public static boolean isEven(int number){
            return number % 2 == 0;
        }



}
