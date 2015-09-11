function checkValue(form, messageE, messageP) {
    
    var email = form[form.id + ":email"];
    var password = form[form.id + ":password"];
    
    if (email.value ==''){
        alert(messageE)
        email.focus();
        return false;
    }
    
    if (password.value ==''){
        alert(messageP)
        password.focus();
        return false;
    } 
    
    return true;
}

function showProgress(data) {
    
    if (data.status == "begin") {
        document.getElementById('loading_wrapper').style.display = "block";
    } else if (data.status == "success") {
        document.getElementById('loading_wrapper').style.display = "none";
    }
}

