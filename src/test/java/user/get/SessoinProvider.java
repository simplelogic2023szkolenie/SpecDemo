package user.get;

import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import org.joda.time.DateTime;

import java.util.Date;

public class SessoinProvider {
    private static Cookie cookie;

    public static boolean isCookieStillValid(){
        if(cookie.equals(null)){
            return false;
        }
        // sprawdz czy cookie jest jest do użytku przez 5 min
        return true;
    }

    public static Cookie getCookie(){
        if(isCookieStillValid()){
            return cookie;
        }
        refreshCookie();
        return cookie;
    }

    private static void refreshCookie(){
        // robimy zapytanie do api to cookie /token
        // i zapisujemy do  cookie
//        cookie = new Cookie();
    }
}
