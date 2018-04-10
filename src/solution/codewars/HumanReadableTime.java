package solution.codewars;

public class HumanReadableTime {
    public String makeReadable(int seconds) {
        // Do something
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public void test()
    {
        int test = 60;
        System.out.println(makeReadable(test));
    }
}
