package com.ufrest;

import com.ufrest.Util.ErrorHandler;
import com.ufrest.Util.ParameterStringBuilder;
import com.ufrest.Util.RequestCaller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class Application implements ErrorController  {

    public static void main(String args[]) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index.html";
    }

    @RequestMapping("/courses/{year}/{semester}")
    @ResponseBody
    Object getCourses(@PathVariable String year, @PathVariable String semester) {
        String scheduleOfCoursesURL = "https://one.ufl.edu/apix/soc/schedule/?";
        Map<String, String> requestParameters = new HashMap<>();

        if (semester.toUpperCase().equals("SPRING")) {
            requestParameters.put("category", "RES");
            requestParameters.put("term", year + "1");
        }
        else if (semester.toUpperCase().equals("SUMMER")) {
            scheduleOfCoursesURL = "https://one.ufl.edu/apix/soc-summer/schedule?";
            requestParameters.put("category", "RES");
            requestParameters.put("term", year + "5");
        }
        else if (semester.toUpperCase().equals("FALL")) {
            requestParameters.put("category", "CWSP"); // The "regular" program is CWSP for this semester
            requestParameters.put("term", "2188"); // For some reason the API is missing the 0 from 2018
        }
        else {
            return ErrorHandler.get404ErrorResponse("Semester value not found");
        }

        // TODO: Attach course filters request parameters
        scheduleOfCoursesURL += ParameterStringBuilder.getParamsString(requestParameters);

        return RequestCaller.callSOC(scheduleOfCoursesURL, requestParameters);
    }


    // TODO: Maybe separate this from the main class
    private static final String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    @ResponseBody
    public Object error() {
        return ErrorHandler.get404ErrorResponse("Resource not found");
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

}
