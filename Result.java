class Result {

    public static void decentNumber(int n) {
        int total_threes = n;
        int total_fives = 0;

        while (total_threes % 3 != 0) {
            total_threes -= 5;
            total_fives += 5;
        }

        if (total_threes < 0) {
            System.out.println("-1");
        } else {
            StringBuilder decentNum = new StringBuilder(total_threes + total_fives);

            for (int i = 0; i < total_threes; i++) {
                decentNum.append("5");
            }

            for (int i = 0; i < total_fives; i++) {
                decentNum.append("3");
            }

            System.out.println(decentNum);
        }
    }
}
