package ink.mints.entity;

public class PersonalInformation {

    private Integer id;
    private String name;
    private String birthday;
    private String schoolOfGraduation;
    private String nativePlace;
    private String nation;
    private String englishName;
    private String phone;
    private String email;
    private String placeOfAbode;
    private String occupation;

    public PersonalInformation(){

    }

    public PersonalInformation(Integer id, String name, String birthday, String schoolOfGraduation, String nativePlace, String nation, String englishName, String phone, String email, String placeOfAbode, String occupation) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.schoolOfGraduation = schoolOfGraduation;
        this.nativePlace = nativePlace;
        this.nation = nation;
        this.englishName = englishName;
        this.phone = phone;
        this.email = email;
        this.placeOfAbode = placeOfAbode;
        this.occupation = occupation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSchoolOfGraduation() {
        return schoolOfGraduation;
    }

    public void setSchoolOfGraduation(String schoolOfGraduation) {
        this.schoolOfGraduation = schoolOfGraduation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaceOfAbode() {
        return placeOfAbode;
    }

    public void setPlaceOfAbode(String placeOfAbode) {
        this.placeOfAbode = placeOfAbode;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "PersonInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", schoolOfGraduation='" + schoolOfGraduation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", nation='" + nation + '\'' +
                ", englishName='" + englishName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", placeOfAbode='" + placeOfAbode + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
