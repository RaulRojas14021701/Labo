
package tcpjava;


public class TCP {
    
    public String Tri(int n1,int n2, int n3){
        double num4= Math.pow(n2,2)-(4*n1*n3);
        double num5;
        double num6;
        String binomio;
        if(num4==0){
            num5=Math.pow(n1,0.5);
            num6=Math.pow(n3,0.5);
            binomio="("+num5+" "+num6+")^2";
            
        }else{
            binomio="no es un TCP";
        }
       return binomio;
    }
}
