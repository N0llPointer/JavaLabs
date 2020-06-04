public class Lab4 {
    public static void main(String[] args){
        Time time = new Time(0,0,0);
        System.out.println("Секунды: " + time.getSeconds());
        System.out.println("Минуты: " + time.getMinutes());
        System.out.println("Часы: " + time.getHours());

        try {
            time.setSeconds(32);
            System.out.println("Секунды: " + time.getSeconds());

            time.setMinutes(41);
            System.out.println("Минуты: " + time.getMinutes());

            time.setHours(12);
            System.out.println("Часы: " + time.getHours());

            time.setSeconds(99);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            time.setTime(1,1,1);
            System.out.println(time.toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
