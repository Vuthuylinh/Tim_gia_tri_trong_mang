import java.util.Scanner;

public class TimPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String input_name =scanner.nextLine();
        String[]Student={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist=false;
        for(int i=0; i<Student.length;i++){
            if(input_name.equals(Student[i])){
                System.out.println("Student " + Student[i]+ "is in the list, at position: "+ (i+1));
                isExist=true;
                break;
            }
        }
        if(!isExist){
            System.out.println("The student "+ input_name+ " is not in the list.");
        }


    }
}
