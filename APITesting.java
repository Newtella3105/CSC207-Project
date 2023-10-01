import okhttp3.*;

import java.io.IOException;

import org.json.JSONObject;

public class APITesting {
    public static void main(String[] args) throws IOException {
        try{
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.iconfinder.com/v4/icons/search?query=chess&count=5")
                    .get()
                    .addHeader("accept", "application/json")
                    .addHeader("Authorization", "Bearer X0vjEUN6KRlxbp2DoUkyHeM0VOmxY91rA6BbU5j3Xu6wDodwS0McmilLPBWDUcJ1")
                    .build();

            Response response = client.newCall(request).execute();
            JSONObject responseObject = new JSONObject(response.body().string());
            System.out.println(responseObject);
        } catch (IOException e){
            System.out.println("Error code: " + e.getMessage());
        }
    }
}