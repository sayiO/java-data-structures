public class CodingBat {
    public static void main(String[] args) {
        double pi = Math.PI;
        int[] piArray = String.valueOf(pi)
                .replaceAll("\\D", "")
                .chars()
                .map(Character::getNumericValue)
                .toArray();





    }
}
