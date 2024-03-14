public class Main {
    public static void main(String[] args) {
        ComoStruct cs = new ComoStruct();
        int aux1 = cs.ar[cs.ar.length-1];
        int aux2;

        for(int i=cs.ar.length-1;i>0;i--){
            aux2 = cs.ar[i-1];
            cs.ar[i-1] = aux1;
            aux1 = aux2;
        }
        cs.ar[cs.ar.length-1] = aux1;

        for(int i = 0;i<cs.ar.length;i++){
            if(i == 0){
                System.out.print(cs.ar[i]);
            }
            else{
                System.out.print("," + cs.ar[i]);
            }
            
        }
        System.out.println("");
    }
}
class ComoStruct {
    int ar[]={3,2,1,5,7,3,0,10,5};
}