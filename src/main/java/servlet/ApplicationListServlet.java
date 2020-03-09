
package servlet;

import db.ApplicationDb;
import model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ApplicationListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationDb applicationDb = new ApplicationDb();
        List<Application> applicationList = applicationDb.getAll();

        req.setAttribute("application-list", applicationList);
        req.getRequestDispatcher("/applications.jsp").forward(req, resp);
    }
}