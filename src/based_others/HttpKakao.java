package based_others;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class HttpKakao {
    public static void main(String[] args) throws UnsupportedEncodingException {
        NetworkUtil nu = new NetworkUtil();
        String url = "https://dapi.kakao.com/v2/local/search/address.json";
        String param = "?query=" + URLEncoder.encode("부산 연제구 연산동 1000", "utf-8");
        String appKey = "d4be7b479f4b4cbd99bd19ae87f88b4b";
        String result = nu.getKakao(url + param, appKey);

        JSONObject obj = new JSONObject(result);
        JSONArray documents = obj.getJSONArray("documents");

        for(int i = 0; i < documents.length(); i++) {
            JSONObject document = documents.getJSONObject(i);
            String addressName = document.getString("address_name");
            String latitude = document.getString("y");
            String longitude = document.getString("x");
            System.out.printf("%s, %s / %s\n", addressName, latitude, longitude);
        }
    }
}
