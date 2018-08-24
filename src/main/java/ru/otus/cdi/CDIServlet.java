package ru.otus.cdi;

import ru.otus.bean.StateManager;
import ru.otus.bean.User;
import ru.otus.bean.interfaces.Logonable;
import ru.otus.qualifier.Id;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cdi")
public class CDIServlet extends HttpServlet {

    @Inject
    User user; //= CDI.current().select(User.class).get();

    @Id
    @Inject
    Logonable logon;

    @Inject
    StateManager manager;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        user.setName("Vitalii Ivanov");
        user.setRegistered(true);
        user.setAge(30);
        user.setAddress("Samara city");
        response.getWriter().println(user.toString());

        manager.next().next().previous().next();
        response.getWriter().println(manager.getState());

        response.getWriter().println(logon.logon());
    }
}
