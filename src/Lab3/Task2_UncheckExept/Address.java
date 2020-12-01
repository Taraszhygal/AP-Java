package Lab3.Task2_UncheckExept;

public class Address {
    private String city;
    private String district;
    private String postCode;

    //constructor
    public Address(String city, String district, String postCode) {
        this.city = city;
        this.district = district;
        this.postCode = postCode;
    }

    //Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
