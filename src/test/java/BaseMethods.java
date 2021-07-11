import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseMethods {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;
    private static final int DELAY = 20;
    private  static String email;
    private  static String password="NowLew97!";
    private  static String userKey;


    @BeforeMethod
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        //I add this because can not get the elemt till the pop up is not full loaded
        driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
       // signUp();
       // driver.manage().addCookie(new Cookie("user_key",userKey));
        driver.manage().addCookie(new Cookie("we-editor-first-open","true"));
        driver.navigate().refresh();

    }

    private static void signUp(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        Date today = new Date();
        email = "selenum"+ today+"@gmail.com";
        HashMap<String,String> requestBody = new HashMap<String, String>();
        requestBody.put("email",email);
        requestBody.put("password",password);
        requestBody.put("isLocal","false");



        RequestBody body = RequestBody.create(mediaType,requestBody.toString());
        Request request = new Request.Builder()
                .url("https://picsartstage2.com/sign-up")
                .method("POST", body)
                .addHeader("authority", "picsartstage2.com")
                .addHeader("sec-ch-ua", "\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"")
                .addHeader("language-code", "en")
                .addHeader("sec-ch-ua-mobile", "?0")
                .addHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36")
                .addHeader("content-type", "application/json")
                .addHeader("accept", "*/*")
                .addHeader("origin", "https://picsartstage2.com")
                .addHeader("sec-fetch-site", "same-origin")
                .addHeader("sec-fetch-mode", "cors")
                .addHeader("sec-fetch-dest", "empty")
                .addHeader("referer", "https://picsartstage2.com/explore")
                .addHeader("accept-language", "en,en-US;q=0.9")
                .addHeader("cookie", "afUserId=25b4e4a5-49b6-41b9-ada5-1c8dd9c131a2-p; _fbp=fb.1.1625039296402.461090477; __zlcmid=14qk8yJWAjx9eo5; _gid=GA1.2.2114129012.1625041652; AF_SYNC=1625041654431; IR_gbd=picsartstage2.com; we_experiment_create_page_id=El-5R7H7TtOUc8d3lhEHxA; we_experiment_create_page_variant=2; we_experiment_seeall_id=CDm03yihQtyAodsMgvt5uw; we_experiment_seeall_variant=0; currentLanguage=en; _pin_unauth=dWlkPU9EUm1ZamN5WW1NdE56ZzVaUzAwTkdVNUxUa3daV1V0TXpZeFkyTmlZMk0xWmpJdw; sid=s%3AfVD5Is5HrmLorq3-0pIqsI1I160XR95s.DqDzsRbUNZXODRRuBVkQ2C3AE9z50zBFpoJKIG56%2FdA; pa_device_id=79185788-882b-47db-b355-91a0a2ed9339; OptanonAlertBoxClosed=2021-06-30T09:45:41.292Z; g_state={\"i_p\":1625067762584,\"i_l\":1}; isOpened=true; we_survey_modal_count=2; IR_PI=e1bdc4a2-2bc3-3a85-bef3-55c46dba0e7c%7C1625166687801; _dd_s=rum=0&expire=1625081638500; badges=j%3A%7B%22VIP%22%3A%22https%3A%2F%2Fcdn130.picsart.com%2F267273314017201.png%22%2C%22Master%20Storyteller%22%3A%22https%3A%2F%2Fpastatic.picsart.com%2Fmasterstoryteller.png%22%2C%22Master%20Contributor%22%3A%22https%3A%2F%2Fpastatic.picsart.com%2Fmastercontributor.png%22%2C%22Celebrity%22%3A%22https%3A%2F%2Fcdn130.picsart.com%2F267273314017201.png%22%2C%22Brands%22%3A%22https%3A%2F%2Fcdn130.picsart.com%2F267273314017201.png%22%2C%22subscribed%22%3A%22https%3A%2F%2Fcdn140.picsart.com%2F270126459015201.png%22%7D; tatari-cookie-test=81975576; tatari-user-cookie=362738649038101; t-ip=1; _ga=GA1.1.573800671.1625041651; like-heartbeat=1; OptanonConsent=isIABGlobal=false&datestamp=Wed+Jun+30+2021+23%3A19%3A08+GMT%2B0400+(Armenia+Standard+Time)&version=6.14.0&hosts=&consentId=450199c2-d323-4be0-935c-6a090a1a02eb&interactionCount=2&landingPath=NotLandingPage&groups=C0001%3A1%2CC0002%3A1%2CC0003%3A1%2CC0004%3A1&AwaitingReconsent=false&geolocation=%3B; IR_11703=1625080747196%7C0%7C1625077657300%7C%7C; _ga_FQMFEN0QZ1=GS1.1.1625077656.7.1.1625080758.0; _ga_QGH2J10S8H=GS1.1.1625077656.7.1.1625080758.0; tatari-session-cookie=04174491-17a8-2f19-2bc4-1ab1d00f4b7d; expraftryer=1")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().toString();
            ObjectMapper mapper = new ObjectMapper();
            SignUpResponseBodyModel responseObject = mapper.readValue(responseBody,SignUpResponseBodyModel.class );
            userKey =  responseObject.getKey();
        }
        catch (IOException e){
            e.getMessage();
        }



    }

    private static  void remove(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"reason\":[\"other\"],\"other_reason\":\"ashdhv\"}");
        Request request = new Request.Builder()
                .url("https://api.picsart.com/preproduction/users/remove")
                .method("POST", body)
                .addHeader("authority", "api.picsart.com")
                .addHeader("sec-ch-ua", "\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"")
                .addHeader("language-code", "en")
                .addHeader("platform", "website")
                .addHeader("sec-ch-ua-mobile", "?0")
                .addHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36")
                .addHeader("x-api-key", userKey)
                .addHeader("content-type", "application/json")
                .addHeader("accept", "*/*")
                .addHeader("origin", "https://picsartstage2.com")
                .addHeader("sec-fetch-site", "cross-site")
                .addHeader("sec-fetch-mode", "cors")
                .addHeader("sec-fetch-dest", "empty")
                .addHeader("referer", "https://picsartstage2.com/")
                .addHeader("accept-language", "en,en-US;q=0.9")
                .build();
        try {
            Response response = client.newCall(request).execute();
        }
        catch (IOException e){
            e.getMessage();
        }


    }

    @AfterMethod
    public void killDriver()  {
        driver.close();
        driver.quit();
        remove();
    }
}
