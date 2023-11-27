package com.electronic.store.dtos;

import com.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String userId;
    @Size(min = 3,max = 30,message = "Invalid name !!")
    private String name;
    @Email(message = "Invalid user email !!")
//    @Pattern(regexp = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b\n",message ="Invalid user email !!" )
    @NotBlank(message = "Email is required !!")
    private String email;
    @NotBlank(message = "Password is required !!")
    private String password;
    @Size(min = 4,max = 6,message = "Invalid gender !!")
    private String gender;
    @NotBlank(message = "Write something about yourself !!")
    private String about;
//    @pattern
//    @custom validator
    @ImageNameValid
    private String imageName;
}
