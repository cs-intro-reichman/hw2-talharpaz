public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int additionalMin = Integer.parseInt(args[1]);

        int totalMin = hours * 60 + minutes + additionalMin;
        int totalHours = totalMin/60;
        int newHours = totalHours%24;
        int newMinuets = totalMin -( totalHours * 60);
        

        String finalHours = (newHours < 10) ? "0" + newHours : String.valueOf(newHours);
        String finalMinutes = (newMinuets < 10) ? "0" + newMinuets : String.valueOf(newMinuets);

        System.out.println(finalHours + ":" + finalMinutes);
        
    }
}
    



