package petmanagement.petmanagement.entity;

public class PetHub {
    private Integer hubid;

    private String address;

    private Integer primaryconnectorid;

    public Integer getHubid() {
        return hubid;
    }

    public void setHubid(Integer hubid) {
        this.hubid = hubid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPrimaryconnectorid() {
        return primaryconnectorid;
    }

    public void setPrimaryconnectorid(Integer primaryconnectorid) {
        this.primaryconnectorid = primaryconnectorid;
    }
}