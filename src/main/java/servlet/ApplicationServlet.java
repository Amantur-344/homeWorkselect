
package servlet;

import db.ApplicationDb;
import model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application application = new Application();
        application.setFullName(req.getParameter("full_name"));
        application.setCourse(req.getParameter("course"));
        application.setIsOnline(Boolean.valueOf(req.getParameter("is_online")));
        application.setEmail(req.getParameter("email"));

        ApplicationDb applicationDb = new ApplicationDb();
        applicationDb.createApplication(application);

        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }
}