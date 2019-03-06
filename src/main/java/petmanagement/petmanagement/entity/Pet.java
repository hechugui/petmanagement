package petmanagement.petmanagement.entity;

public class Pet {
    private Integer petid;

    private String type;

    private Long age;

    private String sex;

    private String color;

    private String statu;

    private Integer hubid;

    private Integer adopterid;

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public Integer getHubid() {
        return hubid;
    }

    public void setHubid(Integer hubid) {
        this.hubid = hubid;
    }

    public Integer getAdopterid() {
        return adopterid;
    }

    public void setAdopterid(Integer adopterid) {
        this.adopterid = adopterid;
    }
}