package com.example.FlipkartDummy.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data  // Lombok generates getters, setters, toString, hashCode, and equals
@NoArgsConstructor  // Default constructor
@Entity // Marks this class as a JPA entity
@Table(name = "Users")
public class SignUpRequestDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message="First name is required")
    @Size(max = 30,min = 2,message = "First name must be between 2 and 30 characters")
    private String firstName;
    @NotNull(message="Last name is required")
    @Size(min = 2, max = 30, message = "Last name must be between 2 and 30 characters")
    private String lastName;
    @NotNull(message="Email is required")
    private String email;
    @NotNull(message="MobileNumber is required")
    private String mobileNumber;
    @NotNull(message="Password is required")
    @Size(max = 32,min = 8,message = "Password must be between  and 32 character")
    private String password;
}
