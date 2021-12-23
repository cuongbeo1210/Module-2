package triangle;

public class Main {
    public static void main(String[] args) {

        String string = "   ";

        String[] s = string.split("");
        int[] side = new int[s.length];
        int checkInt = 0;
        StringBuilder errString = new StringBuilder();
        if (s.length != 3)
            System.out.println("Please input 03 arguments");
        else {
            for (int i = 0; i < s.length; i++) {
                try {
                    side[i] = Integer.parseInt(s[i]);
                } catch (NumberFormatException ex) {
                    checkInt++;
                    errString.append(s[i]).append(" ");
                }
            }
        }
        if (checkInt == 1)
            System.out.println("Wrong input " + errString + " (not a number)");

        else {
            int tmp;
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length - 1; j++) {
                    if (side[i] < side[j]) {
                        tmp = side[i];
                        side[i] = side[j];
                        side[j] = tmp;
                    }
                }
            }
            for (int i = 0; i < s.length; i++)
                System.out.print(side[i] + " ");
        }
        try {
            new RightTriangle(side[0], side[1], side[2]);
        } catch (IllegalRightTriangleException e) {
            System.out.println(e.getString());
        }

    }
}
