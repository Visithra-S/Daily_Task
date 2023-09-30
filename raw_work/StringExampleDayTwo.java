import java.util.Arrays;

class StringExampleDayTwo {

    public static void main(String[] args) {

        String[] names = {"v", "i", "s", "i", "t", "h", "r", "a", "S"};
        names[0] = "Visithra";
        names[1] = "Visithra_S";
        names[2] = "S Visithra";
        names[3] = "Visithra Subramanian";
        names[4] = "Visi";

        System.out.println("names = " + names);

        System.out.println("\n names length =  " + names.length);

        Arrays.stream(names)
                .forEach(nam -> System.out.println("\n nam = " + nam));
    }
}