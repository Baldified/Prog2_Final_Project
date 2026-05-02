public class Certification {

    protected String certificationName;
    protected String expiryDate;

    public Certification() {}

    public Certification(String certificationName, String expiryDate) {
        this.certificationName = certificationName;
        this.expiryDate = expiryDate;
    }

    public Certification(Certification other) {
        this.certificationName = other.certificationName;
        this.expiryDate = other.expiryDate;
    }
}