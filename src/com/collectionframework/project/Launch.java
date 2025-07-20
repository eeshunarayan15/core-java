package com.collectionframework.project;

import com.collectionframework.project.model.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Launch {
    private static LinkedList<Employee> emp;
    static {
        emp=new LinkedList<>();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("P1 -, Insert\nP2 -> Read\nP3 -Update,\nP4 -> Delete\nP5 Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Thank you for using Collection Framework");
                break;

            }
            switch (choice) {
                case 1:
                    System.out.println("Inserting the data");
                    while (true){
                        System.out.println("Enter the id");
                        int id = sc.nextInt();
                        System.out.println("Enter the name");
                        String name = sc.next();
                        System.out.println("Enter the address");
                        String address = sc.next();
                        System.out.println("Enter the sallary");
                        double sallary = sc.nextDouble();
                        ArrayList<String> listOfBook = new ArrayList<>();
                        ArrayList<String> listOfContact = new ArrayList<>();

                        int i=1;
                         while (true){

                             System.out.println("Enter Book "+i+" name" );
                             i++;
                             String bookname=sc.next();
                       listOfBook.add(bookname);
                             System.out.println("Do you want to Add Book Again? (Y/N)");
                             int x = sc.next().charAt(0);
                             if (x == 'N' || x == 'n') {
                                 break;

                             }
                             break;
                         }
                       i=1;
                        while (true){

                            System.out.println("Enter Contact "+i+" name" );
                            i++;
                            String bookname=sc.next();
                            listOfContact.add(bookname);
                            System.out.println("Do you want to Add Contact Again? (Y/N)");
                            int x = sc.next().charAt(0);
                            if (x == 'N' || x == 'n') {
                                break;

                            }
                            break;
                        }
                        Employee employee = new Employee(id, name,address, sallary, listOfContact, listOfBook);
                        emp.add(employee);
                        System.out.println("Do you want to insert or update or delete? (Y/N)");
                        int x = sc.next().charAt(0);
                        if (x == 'N' || x == 'n') {
                            break;

                        }
                    }


                    break;
                case 2:
                    System.out.println("Reading");
                    //read
                    for(Employee e :emp){
                        System.out.println(e.getId());
                        System.out.println(e.getName());
                        System.out.println(e.getAddress());
                        System.out.println(e.getSallary());
                        List<String> listOfContact = e.getListOfContact();
                        System.out.println(listOfContact);
                        List<String> listOfBook = e.getListOfBook();
                        System.out.println(listOfBook);

                    }
                    break;
                case 3:
                    System.out.println("updating");
                    break;

                case 4:
                    System.out.println("Deleting");

                    break;

            }
        }
    }//end of while for menu
}//end of main method
//}//end of class
//        }
