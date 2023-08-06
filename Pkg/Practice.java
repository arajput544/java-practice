package Pkg;

public class Practice {
    public static int[] quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
        //Your code here
        for(int i=0;i<N;i++){
            if(hash[arr[i]%hash_size]==-1){
                hash[arr[i]%hash_size]=arr[i];
            }
            else{
                int c=1;
                int count=0;
                while(hash[(arr[i]+c*c)%hash_size]!=-1 && count<hash_size){
                    c=(c+1)%hash_size;
                    count++;
                }
                if(count<hash_size){
                    hash[(arr[i]+c*c)%hash_size]=arr[i];
                }

            }
        }
        return hash;
    }
    public static void main(String[] args) {
        int hash[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int arr[]={21,10,32,43};
        int ans[]= quadraticProbing(hash,11,arr,4);
        for(int i:ans){
            System.out.println(i);
        }
//        for(int i=0;i<4;i++){
//            hash[i]=4;
//        }
//        for(int i: hash){
//            System.out.println(i);
//        }
    }
}
