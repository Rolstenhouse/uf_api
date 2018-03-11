package com.ufrest.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ufrest.CourseResource.CoursesWrapper;
import com.ufrest.ResponseObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class RequestCaller {
    // This may or may not be good practice
    private static URL url;
    private static HttpURLConnection connection = null;
    private static StringBuffer data = new StringBuffer();
    private static int status = 0;

    public static Object callSOC(String scheduleOfCoursesURL, Map<String, String> requestParameters) {
        CoursesWrapper[] coursesWrapper = new CoursesWrapper[1];

        try {
            url = new URL(scheduleOfCoursesURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            status = connection.getResponseCode();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = inputStream.readLine()) != null) {
                data.append(inputLine);
            }

            inputStream.close();

            ObjectMapper objectMapper = new ObjectMapper();
            // TODO: Fix me - courseWrapper is not getting populated correctly and I have no idea why
            coursesWrapper = objectMapper.readValue(data.toString(), CoursesWrapper[].class);
        } catch (MalformedURLException e) {
            // TODO: Handle error
        } catch (IOException e) {
            // TODO: Handle error
        } catch (Exception e) {
            // TODO: Handle error
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        // Since courseWrapper is not getting set correctly, return the entire String for now
        return new ResponseObject(true, status, data.toString(), "Here is your data");
    }
}
