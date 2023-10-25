public class Days{

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start your day with gratitude.");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Just keep going!");
                break;
            case FRIDAY:
                System.out.println("Yes you did it!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's weekend! Enjoy the rest of the days.");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
You sent
Sa github
