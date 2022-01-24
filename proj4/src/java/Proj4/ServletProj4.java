package Proj4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletProj4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            ArrayList<Ingredients> ingredients = new ArrayList<>();

            Ingredients ingredient1 = new Ingredients("garlic Powder", 1, "tablespoon");
            Ingredients ingredient2 = new Ingredients("dried basil", 1, "tablespoon");
            Ingredients ingredient3 = new Ingredients("salt", 0.5, "teaspoon");
            Ingredients ingredient4 = new Ingredients("salmon", 6, "once");
            Ingredients ingredient5 = new Ingredients("butter", 2, "tablespoon");
            Ingredients ingredient6 = new Ingredients("lemon wedges", 4, "unity");

            ingredients.add(ingredient1);
            ingredients.add(ingredient2);
            ingredients.add(ingredient3);
            ingredients.add(ingredient4);
            ingredients.add(ingredient5);
            ingredients.add(ingredient6);

            Recipe recipe = new Recipe("Step 1 - Stir together the garlic powder, basil, "
                    + "and salt in a small bowl; "
                    + "rub in equal amounts onto the salmon fillets. "
                    + " Step 2 - "
                    + "Melt the butter in a skillet over medium heat; "
                    + "cook the salmon in the butter until browned and flaky, "
                    + "about 5 minutes per side. "
                    + "Serve each piece of salmon with a lemon wedge", ingredients);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<a href=\"index.html\">Home</a>");
            out.print("<a href=\"ServletProj4\">Servlet Here</a>");
            out.println("<head>");
            out.println("<title>Servlet ServletProj4</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> </h1>");
            String value = request.getParameter("multiplier");
            switch (value) {
                case "quarter":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        recipe.getIngredients().get(i).
                                setQuantity(recipe.getIngredients().
                                        get(i).getQuantity() / 4);
                    }

                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");

                    break;
                case "half":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        recipe.getIngredients().get(i).
                                setQuantity(recipe.getIngredients().
                                        get(i).getQuantity() / 2);
                    }
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");
                    break;
                case "one":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");
                    break;
                case "two":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        recipe.getIngredients().get(i).
                                setQuantity(recipe.getIngredients().
                                        get(i).getQuantity() * 2);
                    }
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");
                    break;
                case "three":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        recipe.getIngredients().get(i).
                                setQuantity(recipe.getIngredients().
                                        get(i).getQuantity() * 3);
                    }
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");
                    break;
                case "four":
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        recipe.getIngredients().get(i).
                                setQuantity(recipe.getIngredients().
                                        get(i).getQuantity() * 4);
                    }
                    for (int i = 0; i < recipe.getIngredients().size(); i++) {
                        out.println("<h3>"
                                + recipe.getIngredients().get(i).toString()
                                + "</h3>");
                    }
                    out.println("<h2>" + recipe.getDirections() + "</h2>");
                    break;
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
