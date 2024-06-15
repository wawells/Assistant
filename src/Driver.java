import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Driver {

    private ArrayList<Assistant> assistants;


    public String getCommand() {

        try {

            System.out.print("How may I help? ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String request = reader.readLine();
            
            if (request != null && request.trim().length() > 0)
                return request;
            

        } catch (IOException err) {

            System.out.println("Shit's broke.");
        }


        
        //hopefully you never get here
        return "bad request";
    }


    public boolean getAssistant(int id) {

        return false; // TODO
    }


    public static void main(String[] args) {


        // Assistant widow = new Assistant();


    }


}
