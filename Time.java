public class Time {
     int seconds;
     int minutes;
     int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws Exception {
        if (seconds >= 0 && seconds < 60)
            this.seconds = seconds;
        else
            throw new Exception("Ошибка ввода времени.");
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws Exception {
        if (minutes >= 0 && minutes < 60)
            this.minutes = minutes;
        else
            throw new Exception("Ошибка ввода времени.");
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws Exception {
        if (hours >= 0 && hours < 24)
            this.hours = hours;
        else
            throw new Exception("Ошибка ввода времени.");
    }

    public void setTime(int seconds, int minutes, int hours) throws Exception {
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
