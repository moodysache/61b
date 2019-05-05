public class Discussion5 {

   public static int [] flatten(int [][] x){
       int totalLength=0;
       for(int i=0;i<x.length;i++){
           totalLength+=x[i].length;
       }
       int[] a = new int[totalLength];
       int count=0;
       for(int i=0;i<x.length;i++){
         System.arraycopy(x[i],0,a,count,x[i].length);
         count+=x[i].length;
       }
       return a;
   }

}
