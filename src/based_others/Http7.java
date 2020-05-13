package based_others;

import org.json.JSONArray;
import org.json.JSONObject;
public class Http7 {
    public static void main(String[] args) {
        NetworkUtil nu = new NetworkUtil();
        String result = nu.get("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?serviceKey=A2usf4txsthrBPXx7%2  FckSjISrlOOF3DRCXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieooIvkMdz2XQCt33w%3D%3D&Mobil  eOS=ETC&MobileApp=AppTest&eventStartDate=20191101&_type=json");
        JSONObject obj = new JSONObject(result);
        JSONObject response = obj.getJSONObject("response");
        JSONObject body = response.getJSONObject("body");
        JSONObject items = body.getJSONObject("items");
        JSONArray item = items.getJSONArray("item");
        System.out.println("축제 주소 및 주소");
        System.out.println("================================================");
        for(int i = 0; i < item.length(); i++){
            JSONObject it = item.getJSONObject(i);
            String tel = "";
            if(!it.isNull("tel")) {
                tel = it.getString("tel");
            }
            else
                tel = "none";
            System.out.printf("축제명: %s \n주소: %s \n전화번호: %s\n", it.getString("title"), it.getString("addr1"), tel);
            System.out.println("----------------------------------------------");
        }
    }
}
