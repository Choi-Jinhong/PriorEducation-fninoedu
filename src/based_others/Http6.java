package based_others;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http6 {
    public static void main(String[] args) {
        NetworkUtil nu = new NetworkUtil();
        String result = nu.get("http://ggoreb.com/http/json2.jsp");
        JSONArray obj = new JSONArray(result);

        for(int i = 0; i < obj.length(); i++) {
            //obj 접근 방법
            JSONObject obj2 = obj.getJSONObject(i);
            int age = obj2.getInt("age");
            String name = obj2.getString("name");

            System.out.printf("%d, %s \n", age, name);
        }
    }
}
