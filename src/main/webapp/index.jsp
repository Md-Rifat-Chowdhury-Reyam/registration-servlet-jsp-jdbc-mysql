
<!DOCTYPE html>
<html>
    <head>
        <title>Registration page</title>

<%--        <script type="text/javascript">--%>
<%--            function validationEmail(emailId)--%>
<%--            {--%>
<%--                var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;--%>

<%--                if (emailId.value.match(pattern))--%>
<%--                {--%>
<%--                    document.getElementById('userName').focus();--%>
<%--                    document.getElementById('password').focus();--%>
<%--                    return true;--%>
<%--                }--%>
<%--                else--%>
<%--                {--%>
<%--                    alert("You have entered an invalid email address!")--%>
<%--                    document.getElementById('emailId').focus();--%>
<%--                    return false;--%>
<%--                }--%>

<%--            }--%>
<%--        </script>--%>
    </head>

    <body>
        <div class="main-container">
            <h1>Registration to Accessories</h1>
            <div class="form-container">
                <form class="registration-form" action="registrationServlet" method="post" onclick="validationEmail(document.getElementById('emailId'))">
                    <fieldset class="name-field">
                        <label for="userName">Name</label>
                        <input type="text" name="userName" id="userName" placeholder="Enter your name" required>
                    </fieldset>
                    <fieldset class="email-field">
                        <label for="emailId">Email</label>
                        <input type="email"  name="emailId" id="emailId" placeholder="Enter your email" required >
                    </fieldset>
                    <fieldset class="password-field">
                        <label for="password">Password</label>
                        <input type="password" name="password" id="password" placeholder="Enter your password" required>
                    </fieldset>
                    <button type="submit">submit</button>
                </form>
            </div>
        </div>
    </body>
</html>
