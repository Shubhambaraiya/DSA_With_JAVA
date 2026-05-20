
        sum = sum+n;
        printSum(n-1,sum);
        return;
    }
    public static void main(String []args){
        int n = 100;
        printSum(n,0);
    }
}