import java.util.Scanner;

public class binarysearch {
    public static int simplesearch(int a[],int n){
        for (int i=0;i<a.length;i++){
            if(a[i]==n){
                return i;
            }

        }
        return -1;

    }
    public static int binarysearchself(int a[], int n){
        int m= a[0]+a[a.length-1];
        int mid=m/2;
        if (a[mid]==n){
            System.out.println("hii");
            return mid;
        }
        else if (a[mid]>n){
            for (int i=0; i<mid;i++){
                if(a[i]==n){
                    System.out.println("Less than hii");
                    return i;
                }
            }
        }
        else if (a[mid]<n){
            for (int j=mid;j<a.length;j++){
                if (a[j]==n){
                    System.out.println("greater than hii");
                    return j;
                }
            }
        }
        return -1;
    }
    public static int binaryseachiterative(int a[],int n,int x){
        int low=0,high=x-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (a[mid]==n){
                return mid;
            }
            else if(a[mid]>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binaryseachrecursive(int a[],int low,int high, int n){
        if(low>high) return  -1;
        int mid=(low+high)/2;
        if (a[mid]==n){
            return mid;
        }
        else if(a[mid]<n){
            return binaryseachrecursive(a,mid+1,high,n);

        }
        else {
            return binaryseachrecursive(a,low,mid-1,n);
        }


    }

    public static void main(String[] args) {
        int[] a={2,55,78,44,22,45,66};
        int x=a.length;
        System.out.println("Please enter the number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        int i= simplesearch(a,n);
//        int i = binarysearchself(a,n);
//        int i = binaryseachiterative(a,n,x);
        int low=0, high=a.length-1;
        int j = binaryseachrecursive(a,low, high,n);
        System.out.println(j);
    }
}
