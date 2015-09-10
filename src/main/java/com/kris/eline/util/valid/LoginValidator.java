package com.kris.eline.util.valid;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.kris.eline.util.valid.LoginValidator")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value.toString().length() < 5) {
            //ResourceBundle bundle = ResourceBundle.getBundle("com.kris.eline.mess.messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
            FacesMessage message = new FacesMessage("логин отстой"/*bundle.getString("login_length_error")*/);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
    
    private List<String> getArr() {
        List<String> list = new ArrayList<>();
        list.add("admin");
        list.add("kris");
        return list;
    }
    
}
