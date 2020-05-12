package object;

public class DecodingString {
    public static void main(String[] args) {
        String str = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = 'a';
            if((str.charAt(i) >= 97) && (str.charAt(i) <= 120))
                c = (char) (str.charAt(i) + 2);
            else if(str.charAt(i) == 121 || str.charAt(i) == 122)
                c = (char)(str.charAt(i) - 24);
            else
                c = str.charAt(i);
            System.out.print(c);
        }
    }
}
