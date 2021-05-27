import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Bank combines all other classes and use them to control Bank system
 * @author Mohammed Hany Fattoh
 * Date: 24/4/2021
 */

public class Bank {
    /**
     * Bank's name
     */
    private String name;
    /**
     * Bank`s address
     */
    private String address;
    /**
     * Bank`s phone
     */
    private String phone;

    /**
     * Creates a list of account that controls and store accounts data
     */
    public ArrayList<Account> accountList = new ArrayList<>(5);

    /**
     * Creates a list of clients that controls and store clients data
     */
    public ArrayList<Client> clientList = new ArrayList<>(5);

    /**
     * Creates new client with empty name, address and phone number
     */
    Bank() {
        name = "";
        address = "";
        phone = "";
    }

    /**
     * Creates new Bank user with given name, address and phone number
     * @param name for bank name
     * @param address for bank address
     * @param phone for bank phone
     */
    Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * sets name for the Bank user
     * @param name for bank name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets address for the client
     * @param address for bank address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * sets phone number for the client
     * @param phone for bank phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * gets the Bank user's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets Bank user`s address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * gets Bank user`s phone number
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Creates new account and add it to AccountList
     */
    public void createAccount() {
        Scanner input= new Scanner(System.in);
        Account tempAccount = new Account();
        System.out.println("Please Enter balance:");
        double balance = input.nextDouble();
        tempAccount.setBalance(balance);
        System.out.println("Please Enter Account Number:");
        int accountNum = input.nextInt();
        tempAccount.setAccountNumber(accountNum);
        accountList.add(tempAccount);
    }

    /**
     * Creates new special account and add it to AccountList
     */
    public void createSpecialAccount() {
        Scanner input= new Scanner(System.in);
        SpecialAccount tempAccount = new SpecialAccount();
        System.out.println("Enter balance: ");
        double balance = input.nextDouble();
        tempAccount.setBalance(balance);
        System.out.println("Enter Account Number: ");
        int accountNum = input.nextInt();
        tempAccount.setAccountNumber(accountNum);
        accountList.add(tempAccount);
    }

    /**
     * Creates new client and add it to clientList
     */
    public void createClient() {
        Scanner input= new Scanner(System.in);
        Client tempClient = new Client();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        tempClient.setName(name);
        System.out.println("Enter National ID: ");
        String nationalID = input.nextLine();
        tempClient.setNationalID(nationalID);
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        tempClient.setAddress(address);
        System.out.println("Enter Phone: ");
        String phone = input.nextLine();
        tempClient.setPhone(phone);
        System.out.println("Enter Account Number: ");
        int accountNumber = input.nextInt();
        boolean check = false;
        for(int i = 0; i < accountList.size(); i++)
        {
            if (accountList.get(i).getAccountNumber() == accountNumber)
            {
                tempClient.setAccount(accountList.get(i));
                clientList.add(tempClient);
                check = true;
            }
        }
        if (!check)
        {
            System.out.println("No Account with that number, please try again");

        }
    }

    /**
     * Creates new commercial client and add it to clientList
     */
    public void createCommercialClient() {
        Scanner input= new Scanner(System.in);
        CommercialClient tempClient = new CommercialClient();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        tempClient.setName(name);
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        tempClient.setAddress(address);
        System.out.println("Enter Phone: ");
        String phone = input.nextLine();
        tempClient.setPhone(phone);
        System.out.println("Enter Account Number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter Commercial ID: ");
        String cmmID = input.nextLine();
        String commercialID;
        commercialID = input.nextLine();
        tempClient.setCommercialID(commercialID);
        boolean check = false;
        for(int i = 0; i < accountList.size(); i++)
        {
            if (accountList.get(i).getAccountNumber() == accountNumber)
            {
                tempClient.setAccount(accountList.get(i));
                clientList.add(tempClient);
                check = true;
            }
        }
        if (!check)
        {
            System.out.println("No Account with that number, please try again");

        }
    }

    /**
     * Make deposit from account
     * @param accountNum for the account number to deposit into
     * @param amount for the amount of money deposited
     * @return account number status
     */
    public boolean makeDeposit(int accountNum,double amount){
        for(int i=0; i <accountList.size(); i++){
            if (accountList.get(i).getAccountNumber() == accountNum){
                accountList.get(i).deposit(amount);
                return true;
            }
            else continue;
        }
        return false;
    }

    /**
     * Make withdraw from account
     * @param accountNum for the account number withdraw from
     * @param amount for the amount of money to withdraw
     * @return account number status
     */
    public boolean makeWithdraw(int accountNum,double amount){
        for(int i=0; i <accountList.size(); i++){
            if (accountList.get(i).getAccountNumber() == accountNum){
                accountList.get(i).withdraw(amount);
                return true;
            }
            else continue;
        }
        return false;
    }

    /**
     * Display client and their account info
     * @param clientName client name to display
     */
    public void displayInfo(String clientName){
        Scanner input= new Scanner(System.in);
        boolean check = false;
        for (int i = 0; i < clientList.size(); i++)
        {
            if(clientName.equals(clientList.get(i).getName()))
            {
                System.out.println(clientList.get(i).toString());
                check = true;
            }
        }
        if(!check)
        {
            System.out.println("No Client with That name, please try again");
            String newClientName = input.nextLine();
            displayInfo(newClientName);
        }
    }

    /**
     * Allow user to change and display client's data
     * @param clientID client ID to change or display their data
     * @param type type of the client 1 for normal 2 for commercial
     * @return true if the client was found, false otherwise
     */
    public boolean manageClient(String clientID, int type){
        Scanner input = new Scanner(System.in);
        if(type == 1){
            for (int i=0; i < clientList.size(); i++){

                if(clientList.get(i).getNationalID().equals(clientID)){
                    System.out.println("What would you like to do?");
                    System.out.println("1- Set\n2- Get");
                    int ans = input.nextInt();
                    if (ans == 1){
                        System.out.println("1- Name\n2- Address\n3- Phone number");
                        int answer = input.nextInt();
                        switch (answer){
                            case 1:{
                                System.out.println("Enter Name");
                                clientList.get(i).setName(input.next());
                                return true;
                            }
                            case 2:{
                                System.out.println("Enter address");
                                clientList.get(i).setAddress(input.next());
                                return true;
                            }
                            case 3:{
                                System.out.println("Enter phone number");
                                clientList.get(i).setPhone(input.next());
                                return true;

                            }
                            default:{
                                System.out.println("Invalid Input");
                                return true;
                            }
                        }
                    }
                    if (ans == 2) {
                        System.out.println("1- Name\n2- Address\n3- Phone number\n4- Show all information");
                        int answer = input.nextInt();
                        switch (answer){
                            case 1:{
                                System.out.println(clientList.get(i).getName());
                                return true;
                            }
                            case 2:{
                                System.out.println(clientList.get(i).getAddress());
                                return true;
                            }
                            case 3:{
                                System.out.println(clientList.get(i).getPhone());
                                return true;

                            }
                            case 4:{
                                System.out.println(clientList.get(i).toString());
                                return true;
                            }
                            default:{
                                System.out.println("Invalid Input");
                                return true;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid input");
                        return true;

                    }

                }
                else {
                    continue;
                }

            }
        }
        else if (type ==2){
            for (int i=0; i < clientList.size(); i++){

                if(clientList.get(i).getCommercialID().equals(clientID)){
                    System.out.println("What would you like to do?");
                    System.out.println("1- Set\n2- Get");
                    int ans = input.nextInt();
                    if (ans == 1){
                        System.out.println("1- Name\n2- Address\n3- Phone number");
                        int answer = input.nextInt();
                        switch (answer){
                            case 1:{
                                System.out.println("Enter Name");
                                clientList.get(i).setName(input.next());
                                return true;
                            }
                            case 2:{
                                System.out.println("Enter address");
                                clientList.get(i).setAddress(input.next());
                                return true;
                            }
                            case 3:{
                                System.out.println("Enter phone number");
                                clientList.get(i).setPhone(input.next());
                                return true;

                            }
                            default:{
                                System.out.println("Invalid Input");
                                return true;
                            }
                        }
                    }
                    if (ans == 2) {
                        System.out.println("1- Name\n2- Address\n3- Phone number\n4- Show all information");
                        int answer = input.nextInt();
                        switch (answer){
                            case 1:{
                                System.out.println(clientList.get(i).getName());
                                return true;
                            }
                            case 2:{
                                System.out.println(clientList.get(i).getAddress());
                                return true;
                            }
                            case 3:{
                                System.out.println(clientList.get(i).getPhone());
                                return true;

                            }
                            case 4:{
                                System.out.println(clientList.get(i).toString());
                                return true;
                            }
                            default:{
                                System.out.println("Invalid Input");
                                return true;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid input");
                        return true;

                    }

                }
                else {
                    continue;
                }

            }
        }

        return false;
    }
}
