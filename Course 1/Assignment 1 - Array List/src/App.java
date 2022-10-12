public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addToFront(7);
        numbers.removeFromBack();
        numbers.removeFromFront();
        Object[] numberArray = numbers.getBackingArray();
        for (Object number : numberArray) {
            System.out.println(number);
        }
    }
}
