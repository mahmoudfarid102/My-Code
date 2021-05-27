
import java.util.Scanner;

/**
 * Main class to create new user and manage clients and accounts
 * Date: 24/4/2021
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Make new Bank user
        Bank bank = new Bank();
        //User's choose what they want to do
        while (true){
            System.out.println("What would like to do?");
            System.out.println("1- Add a new account\n2- Add a new Client\n3- Manage a current Account\n4- Manage a current client\n5- quit");
            int ans = input.nextInt();
            switch (ans){
                case 1:{
                    System.out.println("1- Normal Account\n2- Special Account");
                    ans = input.nextInt();
                    if(ans == 1){
                        //calling createAccount method to create new account
                        bank.createAccount();
                    }
                    else{
                        //calling createSpecialAccount method to create new special account
                        bank.createSpecialAccount();
                    }
                    break;
                }
                case 2:{
                    //User chooses client type
                    System.out.println("Would you like to add a normal client or a commercial client");
                    System.out.println("1- normal client\n2- commercial client");
                    ans = input.nextInt();
                    if(ans == 1){
                        //calling createClient method to create new client
                        bank.createClient();
                    }
                    else
                    {
                        //calling createCommercialClient method to create new commercial client
                        bank.createCommercialClient();
                    }
                    break;
                }
                case 3:{
                    //user choose account type
                    System.out.println("Enter Account number");
                    int accNumber = input.nextInt();
                    //user choose process type
                    System.out.println("1- make a deposit\n2-Withdraw");
                    int op = input.nextInt();
                    boolean check = false;
                    System.out.println("Enter the amount");
                    double amount = input.nextDouble();
                    if(op == 1){
                        //call makeDeposit method and assign the result to check to ensure account number is valid
                        check = bank.makeDeposit(accNumber, amount);
                    }
                    if(op == 2){
                        //call makeWithdraw method and assign the result to check to ensure account number is valid
                        check = bank.makeWithdraw(accNumber, amount);
                    }
                    if(op != 1 && op != 2){
                        System.out.println("Invalid Answer");
                    }
                    if(!check){
                        System.out.println("Wrong Account number");
                    }
                    break;

                }
                case 4:{
                    System.out.println("1- Normal Client\n2- Commercial Client");
                    int type = input.nextInt();
                    if (type == 1){
                        System.out.println("Enter Client ID");
                        //calling manageClient method to manage client data
                        boolean check = bank.manageClient(input.next() ,1);
                        if(!check){
                            System.out.println("Client doesn't exist");
                        }
                        break;

                    }
                    if(type ==2){
                        System.out.println("Enter Client ID");
                        //calling manageClient method to manage client data
                        boolean check = bank.manageClient(input.next() ,2);
                        if(!check){
                            System.out.println("Client doesn't exist");
                        }
                        break;

                    }
                    else{
                        System.out.println("Invalid input");
                        break;
                    }
                }
                case 5:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid input...");
                    break;
                }
            }
        }
    }

}
