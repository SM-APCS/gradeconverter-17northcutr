package gradeconverter;
//@Author T.Rex Northcut
public class GradeCheck extends ConsoleProgram
{
    public void run()
    {
        int grade = readInt("What is your grade? ");
        pom = plusOrMinus(grade);
        if(grade<60){
            print("F");
        }
        else if(grade<70){
            print("D"+ pom);
        }
        else if(grade<80){
            print("C"+ pom);
        }
        else if(grade<90){
            print("B"+ pom);
        }
        else if(grade<100){
            print("A"+ pom);
        }
        else{
            print("A+ Noice job!");
        }
    }
    
    private void print(String text){
        System.out.println(text);
    }
    
    private void plusOrMinus(int x){
        c = x%10;
        if(c>0){
            return("-");
        }
        else if(c==5){
            return("");
        }
        else{
            return("+");
        }
    }
}
