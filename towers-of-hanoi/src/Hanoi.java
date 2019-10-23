class Hanoi {

    public static void main (String[] args) {
        hanoi(2, 1, 3, 2);
    }//End of main()

    public static void hanoi (int nDiscs, int moveFrom, int toTarget, int toHelper) {

        if (nDiscs == 1) {
            move (moveFrom, toTarget);
        } else {
            hanoi (nDiscs - 1, moveFrom, toHelper, toTarget);
            move (moveFrom , toTarget);
            hanoi (nDiscs - 1, toHelper, toTarget, moveFrom);
        }
    }//End of hanoi()

    public static void move (int moveFrom, int toTarget) {
        System.out.println (moveFrom + " -> " + toTarget);
    }//End of move()

}//End of Hanoi class
