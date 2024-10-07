public class Main {
    private static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private static void permutation(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutation(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "GOD";
        int n = str.length();
        System.out.println("Permutations of \"" + str + "\" is:");
        permutation(str, 0, n - 1);
    }
}