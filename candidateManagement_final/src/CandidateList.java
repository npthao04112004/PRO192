/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CandidateList extends ArrayList <Candidate> {
    private String id, name, dateOfBirthday, email;
    private double grades;
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw;
    BufferedReader br;
    
    public boolean loadFromFile (String fileName) throws IOException{
        try {
            br = new BufferedReader(new FileReader(fileName));
            String[]arr;
            String line = br.readLine();
            while ((line != null)) {
                arr = line.split(",");
                id = arr[0].trim();
                name = arr[1].trim();
                dateOfBirthday = arr[2].trim();
                grades = Double.parseDouble(arr[3].trim());
                email = arr[4].trim();
                this.add(new Candidate(id, name, dateOfBirthday, email, grades));
                line = br.readLine();
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return false;
    }
    
    public boolean saveToFile (String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter (fileName));
            for (Candidate i: this) {
                pw.println(i);
            }
            pw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    public void addCandidate () {
        boolean check = false;
        do {
            System.out.print("Input ID: ");
            id = scanner.nextLine().trim();
            for (int i = 0; i < this.size(); i++) {
                if (id.equalsIgnoreCase(this.get(i).getId()) || id.isEmpty()) {
                    check = true;
                    System.out.println("This ID is existed or empty. Try another one!");
                    break;
                } else {
                    check = false;
                }
            }
        } while (check == true);
        do {
            System.out.print("Input Name: ");
            name = scanner.nextLine().trim();
            for (int i = 0; i < this.size(); i++) {
                if (name.equalsIgnoreCase(this.get(i).getName()) || name.isEmpty()) {
                    check = true;
                    System.out.println("This Name is existed or empty. Try another one!");
                    break;
                } else {
                    check = false;
                }
            }
        } while (check == true);
        do {
            System.out.print("Input date of birth: ");
            dateOfBirthday = scanner.nextLine();
            if (!isValidDate(dateOfBirthday)) {
                System.out.println("Invalid date format. Please use dd-mm-yyyy.");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.print("Input grades: ");
            try {
                grades = Double.parseDouble(scanner.nextLine());
                if (grades <= 0) {
                    System.out.println("The grades must not be null. Try again !");
                }
            } catch (NumberFormatException e) {
                System.out.println("The grades must be a number. Try again !");
                grades = 0;
            }
        } while (grades == 0);
        do {
            System.out.print("Input Email: ");
            email = scanner.nextLine().trim();
            for (int i = 0; i < this.size(); i++) {
                if (email.equalsIgnoreCase(this.get(i).getEmail()) || email.isEmpty()) {
                    check = true;
                    System.out.println("This ID is existed or empty. Try another one!");
                    break;
                } else {
                    check = false;
                }
            }
        } while (check == true);
        this.add(new Candidate(id, name, dateOfBirthday, email, grades));
        System.out.println("Candidate has added successfully");
    }
    
    public int searchName (String name) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
            return i;
            }
        }
        return -1;
    }
    
    public int searchID (String id) {
        id = id.trim();
        for (int i = 0; i < this.size(); i++) {
        if (id.equals(this.get(i).getId().trim())) { 
            return i;
            }
        }
        return -1;
    }
    
     public boolean delCandidate() {
        int pos;
        String delCandidates;
        System.out.print("Input candidate id to delete: ");
        delCandidates = scanner.nextLine().trim();
        pos = searchID(delCandidates);
        if (pos < 0) {
            System.out.println("Not Found!");
            return false;
        }
        else{
            this.remove(pos);
        }
        return true;
    }
     
    public void listCandidates() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }
    
    public void sortCandidate () {
       Collections.sort(this, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate c1, Candidate c2) {
                if (c1.getGrades() > c2.getGrades()) {
                    return -1;
                } else if (c1.getGrades() < c2.getGrades()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (Candidate candidate : this) {
            System.out.println(candidate);
        }
    }
    
    private boolean isValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}

