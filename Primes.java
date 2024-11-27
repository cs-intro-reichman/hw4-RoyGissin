public class Primes {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int counter=0;
        boolean isprime[]=new boolean[n+1];
        for(int i=2;i<(n+1);i++){
            isprime[i]=true;
        }
        for(int i=2;i<(n+1);i++){
            
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime[i]=false;          
                } 
            } 
             
        }
        System.out.println("Prime numbers up to " + n + ":");
        for(int i=0;i<(n+1);i++){
            if(isprime[i]==true){
                System.out.println(i);
                counter++;
            } 
        }  int y=(100*counter)/n;
        
        System.out.println("There are" + " " + counter + " primes between 2 and " + n + " (" + y + "% are primes)");

    }
}