import static sun.swing.MenuItemLayoutHelper.max;

public class Rope_Cutting_Problem {
    public static int ropeCuttingProblem(int n,int a,int b, int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=max(ropeCuttingProblem(n-a,a,b,c),ropeCuttingProblem(n-b,a,b,c),ropeCuttingProblem(n-c,a,b,c));
        if (res==-1){
            return -1;
        }
        return res+1;

    }
    public static void main(String[] args){
        int n=23,a=12,b=9,c=11;
        int ans=ropeCuttingProblem(n,a,b,c);
        int e=0;
        System.out.println(e%2);
    }

}
