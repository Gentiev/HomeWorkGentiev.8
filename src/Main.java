public class Main {
    public static void main(String[] args) {
//        int[] weights = new int[] {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        weights[0] = 90;
//        int januaryWeight = weights[0];
//        System.out.println(januaryWeight);
//        System.out.println(weights[0]);
//        System.out.println(weights[4]);
//        int january = 0;
//        System.out.println(weights[january]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
//        }

//Задача.1
        int[] massiveInt = new int[3];
        massiveInt[0] = 1;
        massiveInt[1] = 2;
        massiveInt[2] = 3;
        double[] massiveDouble = {1.57, 7.654, 9.986};
        int[] lost = {4, 8, 15, 16, 23, 42};
//Задача.2
        for (int i = 0; i < 3; i++) {
            if (i < 2){
                System.out.print(massiveInt[i] + ", ");
            } else {
                System.out.println(massiveInt[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i < 2){
                System.out.print(massiveDouble[i] + ", ");
            } else {
                System.out.println(massiveDouble[i]);
            }
        }
        for (int i = 0; i < lost.length; i++) {
            if (i < (lost.length - 1)){
                System.out.print(lost[i] + ", ");
            } else {
                System.out.println(lost[i]);
            }
        }
//Задача.3
        for (int i = (massiveInt.length - 1); i >= 0; i--) {
            if (i > 0){
                System.out.print(massiveInt[i] + ", ");
            } else {
                System.out.println(massiveInt[i]);
            }
        }
        for (int i = (massiveDouble.length - 1); i >= 0; i--) {
            if (i > 0){
                System.out.print(massiveDouble[i] + ", ");
            } else {
                System.out.println(massiveDouble[i]);
            }
        }
        for (int i = (lost.length - 1); i >= 0; i--) {
            if (i > 0){
                System.out.print(lost[i] + ", ");
            } else {
                System.out.println(lost[i]);
            }
        }
//Задача.4
        for (int i = 0; i < lost.length; i++){
            if (lost[i] % 2 == 1) {
                lost[i]++;
            }
            System.out.println(lost[i]);
        }
    }
}