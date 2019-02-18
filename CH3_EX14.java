//Class Date
public class CH3_EX14 {
    private int Month;

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    private int Day;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    private int Year;

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public CH3_EX14 (){
        Month = 04;
        Day = 23;
        Year = 1997;

    }
    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }

}


