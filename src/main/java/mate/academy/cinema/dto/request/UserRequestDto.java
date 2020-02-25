package mate.academy.cinema.dto.request;

import javax.validation.constraints.NotEmpty;

import mate.academy.cinema.annotations.EmailValidate;
import mate.academy.cinema.annotations.PasswordEqualsValidate;

@PasswordEqualsValidate
public class UserRequestDto {
    @NotEmpty
    @EmailValidate
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String repeatedPassword;

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
