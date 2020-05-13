package based_others;

import org.json.JSONObject;

public class Http5 {
    public static void main(String[] args) {
        NetworkUtil nu = new NetworkUtil();
        String result = nu.get("http://ggoreb.com/http/json1.jsp");
        JSONObject obj = new JSONObject(result);
        int age = obj.getInt("age");
        String name = obj.getString("name");
        System.out.printf("%d, %s", age, name);
    }
}