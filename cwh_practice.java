public class cwh_practice {


    public static void main(String args[]){
        int[] arr={1,3,45,34};
        int[][] arr2;
        arr2 = new int[2][3];
        arr2[0][0]= 101;
        arr2[0][1]= 102;
        arr2[0][2]= 103;
        arr2[1][0]= 201;
        arr2[1][1]= 202;
        arr2[1][2]= 203;
//        for(int element:arr){
//            System.out.println(element);
//        }
        for(int i=0;i< arr2.length;i++) {
            for (int j=0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }

}
