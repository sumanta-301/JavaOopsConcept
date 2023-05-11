// DNA Sequencing
public class Dna {
  public static void main(String[] args) {
     //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
  String Dna1 = "ATGCGATACGCTTGA" ;
  String Dna2 = "ATGCGATACGTGA" ;
  String Dna3 = "ATTAATATGTACTGA" ;
  String Dna = Dna1;
  int startingPoint = Dna.indexOf("ATG");
  System.out.println("Start: "+startingPoint);
  int length = Dna.length();
  System.out.println("length is " +length);
  int stoppingPoint = Dna.indexOf("TGA");
  System.out.println("Stopping Point is :" +stoppingPoint);
  if(startingPoint != -1 && stoppingPoint != -1 && (stoppingPoint - startingPoint)% 3 ==0){
    System.out.println("Condition 1, 2 and 3 are satisfied");
    String protein = Dna.substring(startingPoint, stoppingPoint+3);
    System.out.println("Protein: "+protein);
  } else {
    System.out.println("No Protein");
  }
  }
}