package ink.mints.entity;

public class Home {

    private Integer id;
    private String salutatoryOration;
    private String meInfoOne;
    private String meInfoTwo;
    private String meInfo;

    public Home(){

    }

    public Home(Integer id, String salutatoryOration, String meInfoOne, String meInfoTwo, String meInfo) {
        this.id = id;
        this.salutatoryOration = salutatoryOration;
        this.meInfoOne = meInfoOne;
        this.meInfoTwo = meInfoTwo;
        this.meInfo = meInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalutatoryOration() {
        return salutatoryOration;
    }

    public void setSalutatoryOration(String salutatoryOration) {
        this.salutatoryOration = salutatoryOration;
    }

    public String getMeInfoOne() {
        return meInfoOne;
    }

    public void setMeInfoOne(String meInfoOne) {
        this.meInfoOne = meInfoOne;
    }

    public String getMeInfoTwo() {
        return meInfoTwo;
    }

    public void setMeInfoTwo(String meInfoTwo) {
        this.meInfoTwo = meInfoTwo;
    }

    public String getMeInfo() {
        return meInfo;
    }

    public void setMeInfo(String meInfo) {
        this.meInfo = meInfo;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", salutatoryOration='" + salutatoryOration + '\'' +
                ", meInfoOne='" + meInfoOne + '\'' +
                ", meInfoTwo='" + meInfoTwo + '\'' +
                ", meInfo='" + meInfo + '\'' +
                '}';
    }
}
