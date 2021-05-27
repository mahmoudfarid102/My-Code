/**
 * Represent the bank`s commercial client.
 * Inherits from class client.
 * Commercial client can have an account.
 * @author Mahmoud Farid Mohamed
 * Date: 24/4/2021
 */
public class CommercialClient extends Client {
    /**
     * The company commercial ID.
     */
    private String commercialID;

    /**
     * Creates new commercial client with
     * empty commercial ID.
     */
    CommercialClient(){ commercialID = ""; }

    /**
     * Creates new commercial client with given
     * name, commercial ID, address, phone number
     * and account.
     * @param name the commercial client`s name
     * @param commercialID the commercial client`s ID
     * @param address the commercial client`s address
     * @param phone the commercial client`s phone number
     * @param account the commercial client`s account
     */
    public CommercialClient(String name, String commercialID, String address, String phone, Account account) {
        super(name, "00000000000000", address, phone, account);
        this.commercialID = commercialID;
    }

    /**
     * sets commercial ID for the company
     * @param commercialID the commercial client ID
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * gets the client`s commercial ID
     * @return commercialID
     */
    @Override
    public String getCommercialID() {
        return commercialID;
    }

    /**
     * Display the commercial client info
     * @return client info
     */
    @Override
    public String toString() {
        return "CommercialClient{" +
                "name='" + super.getName() + '\'' +
                ", nationalID='" + super.getNationalID() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", commercialID='" + commercialID + '\'' +
                ", " + super.getAccount().toString() +
                '}';
    }
}
