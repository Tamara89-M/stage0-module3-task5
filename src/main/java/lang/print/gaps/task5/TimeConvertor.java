package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float second = minutes * 60;
        System.out.println(second);
    }

    public static void main(String[] args) {
        TimeConvertor tc = new TimeConvertor();
        tc.convert(2.5f);
    }
}
