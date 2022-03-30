public double average(int[] salary) {
        double sum = 0;
        int n = salary.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num: salary) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return (sum - max - min) / (n - 2);
    }
