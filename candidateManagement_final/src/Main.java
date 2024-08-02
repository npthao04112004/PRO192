
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Main {
     public static void main(String[] args) throws IOException {
        int choice;
        boolean checkSuccessful;
        String fileCandidateName = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\candidateManagement_final\\src\\candidates_input.txt";
        CandidateList candidateList = new CandidateList();
        candidateList.loadFromFile(fileCandidateName);
        String cID;
        ArrayList<String> ops = new ArrayList<>(7);
        System.out.println("Candidate Management System");
        System.out.println("-------------------");
        ops.add ("1 . Load all candidate from file and display");
        ops.add ("2 . Add a candidate");
        ops.add ("3 . Search a candidate by name");
        ops.add ("4 . Delete a candidate by candidate id");
        ops.add ("5 . Sort descending the list of candidates by grades");
        ops.add ("6 . Exit");
        
        Menu menu = new Menu();
        
        do{
            choice = menu.int_getChoice(ops);
            switch(choice){
                case 1:
                    candidateList.listCandidates(); 
                    break;
                case 2:
                    candidateList.addCandidate();
                    break;
                case 3:
                    System.out.print("Input candidate name: ");
                    cID = new Scanner(System.in).nextLine();
                    if (candidateList.searchName(cID) == -1) {
                        System.out.print("Candidate not found !" + "\n");
                    } else {
                        System.out.println(candidateList.get(candidateList.searchName(cID)).toString());
                    }
                    break;
                case 4:
                    checkSuccessful = candidateList.delCandidate();
                    if (checkSuccessful) {
                        System.out.println("Candidate removed successfully !");
                    } else {
                        System.out.println("Candidate removed unsuccessfully !");
                    }
                    break;
                case 5:
                    candidateList.sortCandidate();
                    break;
            } 
        }while((choice > 0) && (choice <= 5));
    }
}
