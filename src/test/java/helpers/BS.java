package helpers;

import config.BSConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class BS {

    static BSConfig config = ConfigFactory.create(BSConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {

        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getUserName(), config.getAccessKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
