public class Main {
    public static void main(String[] args) {
        int l = (int) (Math.random() * 100 + 1);
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * l * 10);
        }
        System.out.println(l + "\n----");
        for (int k : array) {
            System.out.println(k);
        }
        int min = array[0];
        int max = array[0];
        double sum = array[0];
        double avg;

        for (int j : array) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
            sum += j;
        }
        avg = sum / array.length;
        System.out.println("min = " + min + ", max = " + max + ", avg = " + avg);
    }
}
