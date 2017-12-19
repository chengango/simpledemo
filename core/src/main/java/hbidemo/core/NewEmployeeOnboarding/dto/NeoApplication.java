package hbidemo.core.NewEmployeeOnboarding.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "lvmh_neo_application")
public class NeoApplication extends BaseDTO {

     public static final String FIELD_ID = "id";
     public static final String FIELD_NAME = "name";
     public static final String FIELD_VALUE = "value";
     public static final String FIELD_NUM = "num";
     public static final String FIELD_USER_CODE = "userCode";
     public static final String FIELD_APPLICANT = "applicant";
     public static final String FIELD_RECEIPTOR = "receiptor";


     @Id
     @GeneratedValue
     private Long id; //ID

     @Length(max = 255)
     private String name; //字段名

     @Length(max = 255)
     private String value; //字段值

     private String num; //序号

     private String userCode;

     private String applicant;

     private String receiptor;
     @Transient
     private String userName;
     @Transient
     private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getReceiptor() {
        return receiptor;
    }

    public void setReceiptor(String receiptor) {
        this.receiptor = receiptor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

     public void setName(String name){
         this.name = name;
     }

     public String getName(){
         return name;
     }

     public void setValue(String value){
         this.value = value;
     }

     public String getValue(){
         return value;
     }

     public void setNum(String num){
         this.num = num;
     }

     public String getNum(){
         return num;
     }

     }