public class solution_roblox {
    static int[] solution(int[] diffs) {

        int length = diffs.length;
        int[] ans = new int[length];
        int[] sol = new int[2];
        if(diffs.length == 0){
            sol[0] = 1500;
            sol[1]=1500;
            return sol;
        }
        ans[0] = 1500 + diffs[0];
        for(int i=1; i<length; i++){
            ans[i] = ans[i-1] + diffs[i];
        }
        int max = 0;
        for(int j=0;j<length;j++){
            if(ans[j]>=max){
                max=ans[j];
            }
        }

        int min = ans[0];

        for(int k=1; k<length;k++){
            if(ans[k]<=min){
                min=ans[k];
            }
        }
        if(max<=1500){
            sol[0] =1500;
        }
        else{
            sol[0] = max;
        }

        sol[1] = min;

        return sol;
    }
    int solution(int[] arr1, int[] arr2) {
        // int ans[] = new int[arr1.length];
        int sum[] = new int[arr1.length];
        int sumoffirst = 0;
        for(int k=0;k<arr1.length;k++){
            sumoffirst = sumoffirst + Math.abs(arr1[k] - arr2[k]);
        }
        sum[0] = sumoffirst;
        for(int i = 1; i<arr1.length; i++){
            int temp= arr1[0];
            for(int h=1;h<arr1.length;h++){
                arr1[h] = arr1[h+1];
            }
            arr1[arr1.length-1] = temp;
            int sumvar = 0;
            for(int p=0;p<arr1.length;p++){
                sum[i] = sumvar+ Math.abs(arr1[p] - arr2[p]);
            }
        }
        int min= sum[0];
        for(int i=0;i<sum.length;i++){
            if(sum[i]<=min){
                min=sum[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int diffs[] = new int[5];
        diffs[0] = 10;
        diffs[1] = 10;
        diffs[2] = 10;
        diffs[3] = 10;
        diffs[4] = 10;
        int sol[] = new int[2];
        sol = solution(diffs);
        for(int element : sol){
            System.out.println(element);
        }

    }

}
