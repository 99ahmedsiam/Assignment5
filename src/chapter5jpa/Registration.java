
package chapter5jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
    @NamedQuery(name="regQueryFindALL", query="SELECT reg FROM Registration reg"),
    @NamedQuery(name="regQueryFindByID", query="SELECT reg FROM Registration reg WHERE reg.studentid= :studentid")
})
public class Registration implements Serializable  {
   
    @Id 
    @OneToMany
    private String studentid ;
    @Id 
    private String courseid;
    @Id
    private String smester;

    public Registration() {
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getSmester() {
        return smester;
    }

    public void setSmester(String smester) {
        this.smester = smester;
    }

   
    
}
