public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        if (earlier(comparedDate)) {
            if (comparedDate.month > this.month || comparedDate.month == this.month && comparedDate.day >= this.day ) {
                return comparedDate.year - this.year;
            }
            return comparedDate.year - this.year - 1;
        }
        else {
            if (comparedDate.month < this.month || comparedDate.month == this.month && comparedDate.day <= this.day) {
                return this.year - comparedDate.year;
            }
            return this.year - comparedDate.year - 1;
        }

    }
}
