/**
 * Class Client represent the client in the bank
 * Client can have account
 * @author Mahmoud Farid Mohamed
 * Date: 24/4/2021
 */
public class Client {
    /**
     * The name of the client
     */
    private String name;
    /**
     * Client`s national ID
     */
    private String nationalID;
    /**
     * Client`s address
     */
    private String address;
    /**
     * Client`s phone number
     */
    private String phone;
    /**
     * Client`s account
     */
    private Account account;

    /**
     * Creates new client with empty name, national ID, address and phone number
     */
    public Client(){
        name = "";
        nationalID = "";
        address = "";
        phone = "";
    }

    /**
     * Creates new client with given name, national ID, address and phone number
     * @param name take the client`s Name
     * @param nationalID take the client`s national ID
     * @param address take the client`s address
     * @param phone take the client`s phone number
     * @param account take the client`s account
     */
    public Client(String name, String nationalID, String address, String phone, Account account){
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * sets name for the client
     * @param name the client`s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets national ID for the client
     * @param nationalID the client`s national ID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * sets address for the client
     * @param address the client`s address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * sets phone number for the client
     * @param phone the client`s phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * sets account for the client
     * @param account the client`s account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * gets the client`s name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets client`s national ID
     * @return nationalID
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * gets client`s address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * gets client`s phone number
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * gets client`s account
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Display the client info
     * @return client info
     */
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", " + account.toString() + '\'' +
                '}';
    }

    /**
     * Method to be overridden to CommercialClient class
     * @return the commercial client`s ID
     */
    protected String getCommercialID() {
        return null;
    }
}
