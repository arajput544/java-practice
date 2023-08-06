public class gfg_immidiate_smaller {
    public static int anothersolution(int[] arr,int n,int x){
        int s=-1;
        for (int i=0;i<n;i++){
            if(arr[i]<x && arr[i]>s){
                s=arr[i];
            }
        }
        return s;
    }
    public static int imm_mine(int[] arr, int n,int x){
        int small=x,diff=0,r=0;
        for(int i=0; i<n;i++){

            if(arr[i]<x){
                diff=x-arr[i];
                if(diff<small){
                    small=diff;
                    r=arr[i];
                }
            }

        }
        if(diff ==0){
            return -1;
        }

        return r;

    }
    public static void main(String[] args) {
        int[] arr={4,67,5,78,6,4};
        int x=15;
        int n=arr.length;
        int r=imm_mine(arr,n,x);
        int c=anothersolution(arr,n,x);
        System.out.println(c);
    }
}
