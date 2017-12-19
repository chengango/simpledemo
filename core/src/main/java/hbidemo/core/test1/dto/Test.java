package hbidemo.core.test1.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "user_test")
public class Test extends BaseDTO {

     public static final String FIELD_USER_ID = "userId";
     public static final String FIELD_USER_NAME = "userName";
     public static final String FIELD_PASSWORD = "password";
     public static final String FIELD_SEX = "sex";
     public static final String FIELD_AGE = "age";
     public static final String FIELD_BIRTHDAY = "birthday";


     @Id
     @GeneratedValue
     private Long userId;

     @Length(max = 50)
     private String userName; //用户名

     @Length(max = 50)
     private String password; //密码

     @NotEmpty
     @Length(max = 2)
     private String sex; //性别

     private Long age; //年龄

     private Date birthday; //年龄


     public void setUserId(Long userId){
         this.userId = userId;
     }

     public Long getUserId(){
         return userId;
     }

     public void setUserName(String userName){
         this.userName = userName;
     }

     public String getUserName(){
         return userName;
     }

     public void setPassword(String password){
         this.password = password;
     }

     public String getPassword(){
         return password;
     }

     public void setSex(String sex){
         this.sex = sex;
     }

     public String getSex(){
         return sex;
     }

     public void setAge(Long age){
         this.age = age;
     }

     public Long getAge(){
         return age;
     }

     public void setBirthday(Date birthday){
         this.birthday = birthday;
     }

     public Date getBirthday(){
         return birthday;
     }

     }
