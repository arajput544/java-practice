public class bubblesort {
    public static void main(String[] args) {
        int[] a= {98,45,112,45};
        for (int i=0; i<a.length; i++){
            for (int j=0;j<a.length;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int o=0;o<a.length;o++){
            System.out.println(a[o]);
        }

    }
}
