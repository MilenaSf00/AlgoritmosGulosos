class Result {
    /*
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as a parameter.
     */

     public static void decentNumber(int n) {
        int numThrees = n;
        int numFives = 0;

        while (numThrees % 3 != 0) {
            numThrees -= 5;
            numFives += 5;
        }

        if (numThrees < 0) {
            System.out.println("-1");
        } else {
            String repeated5 = repeatString("5", numThrees);
            String repeated3 = repeatString("3", numFives);
            
            System.out.println(repeated5 + repeated3);
        }
    }

    private static String repeatString(String str, int count) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(str);
        }
        return repeated.toString();
    }
}


