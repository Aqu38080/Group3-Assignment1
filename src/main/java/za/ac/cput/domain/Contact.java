/*Aquilla Williams
  217284205
*/

package za.ac.cput.domain;

public class Contact {

    private int phoneNumber;
    private String emailAddress;
    private String alternativeNumber;

    public Contact(int phoneNumber, String emailAddress, String alternativeNumber) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.alternativeNumber = alternativeNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAlternativeNumber(String alternativeNumber) {
        this.alternativeNumber = alternativeNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAlternativeNumber() {
        return alternativeNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", alternativeNumber='" + alternativeNumber + '\'' +
                '}';
    }
}
