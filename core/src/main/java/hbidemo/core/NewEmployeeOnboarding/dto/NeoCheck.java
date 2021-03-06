package hbidemo.core.NewEmployeeOnboarding.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "lvmh_neo_check")
public class NeoCheck extends BaseDTO {

     public static final String FIELD_ID = "id";
     public static final String FIELD_C_NAME = "cName";
     public static final String FIELD_C_VALUE = "cValue";
     public static final String FIELD_C_NUM = "cNum";


     @Id
     @GeneratedValue
     private Long id; //ID

     @Length(max = 255)
     private String cName; //字段名

     @Length(max = 255)
     private String cValue; //字段值

     private String cNum; //序号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }
}
