package SS.Spring.spring.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact extends baseEntity {

    private int contactId;

    @NotBlank(message = "name must not be blank")
    @Size(min = 3,message = "name must be atleat 3 charecter long")
    private String name;
    @NotBlank(message = "mobilenumber must not be blank")
    @Pattern(regexp ="(^$|[0-9]{10})",message ="mobile number must be 10 digit" )
    private String mobileNum;
    @NotBlank(message = "email must not be blank")
    @Email(message = "please provide an valid email address")
    private String email;
    @NotBlank(message = "subject must not be blank")
    @Size(min = 5,message = "subject must be atleat 5 charecter long")
    private String subject;
    @Size(min = 3,message = "message must be atleat 3 charecter long")
    @NotBlank(message = "subject must not be blank")
    private String message;

    private String status;


}
