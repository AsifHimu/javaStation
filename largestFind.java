class largestFind extends Thread {
    public int[] numbers;
    public int start, end, max;

    public largestFind(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public int getMax() {
        return max;
    }

    public void run() {
        max = maxFind(numbers, start, end);
    }

    int maxFind(int[] numbers, int start, int end) {
        int mx = Integer.MIN_VALUE;

        for (int i = start; i < end; i++) {
            if (numbers[i] > mx) {
                mx = numbers[i];
            }
        }
        System.out.printf("Find max %d to %d = %d\n", start, end, mx);

        return mx;
    }
}
