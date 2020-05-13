package based_others;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class HttpNaver {
    public static void main(String[] args) throws UnsupportedEncodingException {
        NetworkUtil nu = new NetworkUtil();
        String url = "https://openapi.naver.com/v1/papago/n2mt";
        String param = "source=ko&target=fr&text=";
        param += URLEncoder.encode("안녕하세요. 저는 자바 개발자입니다.", "utf-8");
        String clientId = "OpcnSsAIn37qIu6Iyad6";
        String clientSecret = "p7qtbsYx8N";
        String result = nu.postNaver(url, param, clientId, clientSecret);
        JSONObject obj = new JSONObject(result);
        JSONObject message = obj.getJSONObject("message");
        JSONObject res = message.getJSONObject("result");
        String translatedText = res.getString("translatedText");
        System.out.printf("%s", translatedText);
    }
}

