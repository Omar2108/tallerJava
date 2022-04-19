
package com.tallerjava.taller3;


class punto3 {
    private int a,b,c,d,i,j,k;
    private boolean control;

    public static void punto3() {
        boolean control=true;
        int n =10;
        do{
            for(int a=0; a<n+(n/2); a++){
               for(int i=n+(n/2); i>a; i--){
                   System.out.print(" ");
                }
            
                for(int b =1; b <= (2*a)-1;b++){
                   System.out.print("*");
                }
                System.out.println();
            }
        
            for(int c = 1; c < n-(n/2); c++){
                for(int d = n + (n/2); d>1;d--){
                    System.out.print(" ");
                }
                System.out.println("***");
            }
            control = false;
        }while(control ==true);
        
        
    }
    
}
