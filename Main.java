
import java.util.LinkedList;
import java.util.Scanner;

class Contact {
    String name;
    String email;
    String phone;
    public Contact(String name,String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}

public class Main {
    public static void main(String[] args) {
        boolean program = true;
        while(program) {
            Scanner in = new Scanner(System.in);
            System.out.println("Ple6ase choose the option below ");
            System.out.println("1.(A)add contact ");
            System.out.println("2.(D)elete  ");
            System.out.println("3.(E)mail search ");
            System.out.println("4.(P)rint list ");
            System.out.println("5.(S)earch ");
            System.out.println("6.(Q)uit ");
            int choice = in.nextInt();

            switch (choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    emailSearch();
                    break;
                case 4:
                    printList();break;
                case 5:
                    search();
                    break;
                case 6:
                    program = false;
                    System.out.println("Exiting program!");
                    break;
            }
        }


    }
    static LinkedList<Contact> linkedlist = new LinkedList<>();
     static void addContact () {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your name ");
         String name = scan.nextLine();
         System.out.println("Enter your email ");
         String email = scan.nextLine();
         System.out.println("Enter your phone number ");
         String phone = scan.nextLine();
         linkedlist.add(new Contact(name, email, phone));

     }
    static void deleteContact (){
         Scanner scan2 = new Scanner(System.in);
         System.out.println("Please write the contact that you wished to delete ");
         String delete = scan2.nextLine();
         for(Contact i : linkedlist){
             if(delete.equals(i.name)){
                 linkedlist.remove(i);
             } else {
                 System.out.println("Contact that you wished to delete is wrong, please try again ");
             }
         }
    }

    static void emailSearch (){
         Scanner scan3 = new Scanner(System.in);
         System.out.println("Please enter the email that you wish to search ");
         String search = scan3.nextLine();
        for(Contact i : linkedlist){
            if(search.equals(i.name)){
                System.out.println("The email that you search for "+ search +"is founded");
            } else {
                System.out.println("email is not founded, please try again ");
            }
        }
    }

    static void printList(){
         for(Contact i : linkedlist){
             System.out.println(i.name);
             System.out.println(i.email);
             System.out.println(i.phone);
         }
    }

    static void search() {
         Scanner scan4 = new Scanner(System.in);
         System.out.println("Please choose what do you want to search ");
         System.out.println("1.Name ");
         System.out.println("2.Email ");
         System.out.println("3.Phone ");
         int searching = scan4.nextInt();


         if (searching == 1) {
                 Scanner scan5 = new Scanner(System.in);
                 System.out.println("Please enter the email that you wish to search ");
                 String names = scan5.nextLine();
                 for (Contact j : linkedlist) {
                     if (names.equals(j.name)) {
                         System.out.println("The name that you search for " + names + "is founded");
                     } else {
                         System.out.println("name is not founded, please try again ");
                     }
                 }
             }

        if (searching == 2) {
            Scanner scan6 = new Scanner(System.in);
            System.out.println("Please enter the email that you wish to search ");
            String emails = scan6.nextLine();
            for (Contact j : linkedlist) {
                if (emails.equals(j.name)) {
                    System.out.println("The email that you search for " + emails + "is founded");
                } else {
                    System.out.println("email is not founded, please try again ");
                }
            }
        }


        if (searching == 3) {
            Scanner scan7 = new Scanner(System.in);
            System.out.println("Please enter the email that you wish to search ");
            String phones = scan7.nextLine();
            for (Contact j : linkedlist) {
                if (phones.equals(j.name)) {
                    System.out.println("The Phone number that you search for " + phones + "is founded");
                } else {
                    System.out.println("Phone number is not founded, please try again ");
                }
            }
        }

    }



}