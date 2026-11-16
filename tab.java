public static void main(String[] args) {
    double [] myList= new double[10];
    //java.util.Scanner input= new java.util.Scanner(System.in);
    //System.out.println("entre"+myList.length + "values:")
    //for ( int i =0;i< myList.length;i++)
        //myList[i] = input.nextDouble();
    for ( int i =0;i< myList.length;i++){
        myList[i]=Math.random()*100;
        System.out.print();
    }
    for ( int i =0;i< myList.length;i++){
        System.out.println(myList[i]+" ");
    }
    

}