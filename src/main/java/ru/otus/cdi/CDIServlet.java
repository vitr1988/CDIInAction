package ru.otus.cdi;

import ru.otus.bean.StateManager;
import ru.otus.bean.User;
import ru.otus.bean.interfaces.Logonable;
import ru.otus.qualifier.Id;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cdi")
public class CDIServlet extends HttpServlet {

    @Any
    @Inject
    Instance<User> userInstance;

    @Inject
    Instance<StateManager> managerInstance;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = userInstance.get();
        user.setName("Vitalii Ivanov");
        user.setRegistered(true);
        user.setAge(30);
        user.setAddress("Samara city");
        response.getWriter().println(user.toString());

        StateManager manager = managerInstance.get();
        manager.next().next().previous().next();
        response.getWriter().println(manager.getState());
    }
}
