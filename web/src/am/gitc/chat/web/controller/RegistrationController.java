package am.gitc.chat.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static am.gitc.chat.common.util.Validator.isEmpty;
import static am.gitc.chat.common.util.Validator.isInvalidEmail;

public class RegistrationController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String gender = request.getParameter("gender");
        Map<String, String> errors = new HashMap<String, String>();
//        IUserManager manager = new UserManager();
        if (isEmpty(name)) {
            errors.put("nameError", "please fill the name");
        }
        if (isEmpty(surname)) {
            errors.put("surnameError", "please fill the surname");
        }
        if (isEmpty(username)) {
            errors.put("usernameError", "please fill the username");
        }
        if (isEmpty(gender)) {
            errors.put("genderError", "please select the gender");
        }

        if (isEmpty(password)) {
            errors.put("passwordError", "please fill the password");
        } else if (isEmpty(confirmPassword)) {
            errors.put("ConfirmPasswordError", "please fill the Confirm Password");
        } else if (!password.equals(confirmPassword)) {
            errors.put("passwordError", "Passwords are not the same");
        }
        if (isEmpty(email)) {
            errors.put("emailError", "please fill the email");
        } else if (isInvalidEmail(email)) {
            errors.put("emailError", "please insert valid email");
        }
//        else if(){
//
//        }


        if (errors.isEmpty()) {

        }else{
            request.setAttribute("errors",errors);
            request.getRequestDispatcher("/registration.jsp").forward(request,response);
        }
    }
}
