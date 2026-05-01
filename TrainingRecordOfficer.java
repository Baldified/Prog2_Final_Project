
import java.util.ArrayList;
import java.util.List;

public class TrainingRecordOfficer extends SwornOfficer {

    protected List<Certification> certifications;

    public TrainingRecordOfficer() {
        super();
        this.certifications = new ArrayList<>();  //COMPOSITION
    }
    
    public void addCertification(Certification a) {
        certifications.add(a);
    }
}