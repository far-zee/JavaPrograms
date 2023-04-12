package InterviewQuestions;

public class Nes
{
    public static void main(String[] args) {
      String a = "ArchanaQAHyderabad";

      for (int i=0; i < a.length(); i++){
        if (i % 2 != 0){
          a = a.substring(0,i-1) + "_" + a.substring(i, a.length());
        }
      }


      System.out.println(a);

    }
}