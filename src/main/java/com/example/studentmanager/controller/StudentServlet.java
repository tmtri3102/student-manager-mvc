package com.example.studentmanager.controller;
// Import all model, service and servlet api with exceptions
import com.example.studentmanager.*;
import com.example.studentmanager.model.Student;
import com.example.studentmanager.service.StudentService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "StudentServlet", urlPatterns = "/students")
public class StudentServlet  extends HttpServlet {
    // Tao object cua service
    private final StudentService studentService = new StudentService();
    // doGet va doPost - protected?
    // 1. doPost va cac tac vu lien quan
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy Parameters (Dữ liệu request gửi đi) có name là "action".
        String action = request.getParameter("action");

        // Nếu dữ liệu request gửi đi không có "action" thì sẽ trả về null.
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createStudent(request, response);
                break;
//            case "edit":
//                updateStudent(request, response);
//                break;
//            case "delete":
//                deleteStudent(request, response);
//                break;
            default:
                break;
        }
    }

    private void createStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int) (Math.random()*1000);
        String name = request.getParameter("name");
        int score = Integer.parseInt(request.getParameter("score"));

        Student student = new Student(id, name, score);
        this.studentService.save(student);
        RequestDispatcher view = request.getRequestDispatcher("student/create.jsp");
        request.setAttribute("message", "New student created sucessfully!");
        try {
            view.forward(request, response);
        }
        catch (ServletException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

//==================================================================================================================================================================================================


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
//            case "edit":
//                showEditForm(request, response);
//                break;
//            case "delete":
//                showDeleteForm(request, response);
//                break;
            case "view":
                viewStudent(request, response);
                break;
            default:
                listStudent(request, response);
                break;
        }
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("student/create.jsp");
        try {
            view.forward(request, response);
        }
        catch (ServletException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Student> student = this.studentService.findAll();
        RequestDispatcher dispatcher;
        if(student == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("student", student);
            dispatcher = request.getRequestDispatcher("student/view.jsp");
        }
        try{
            dispatcher.forward(request, response);
        }
        catch (ServletException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = this.studentService.findAll();
        request.setAttribute("students", students);
        RequestDispatcher view = request.getRequestDispatcher("student/list.jsp");
        try{
            view.forward(request, response);
        }
        catch (ServletException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
