package based_others;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LectureDownload {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            //저장될 파일의 경로와 파일명
            fos = new FileOutputStream("c:/dev/01.mp4"); //위치는 어디든지 가능하지만 실제 존재해야한다.
            //URL의 위치에 파일을 가져오기
            URL url = new URL("http://subcontentsdnak.ollehslp.com//0014533/01.mp4\n");
            //URL 부분을 고쳐서 해킹하는 것을 파라미터 공격이다.
            URLConnection urlConnection = url.openConnection();
            is = urlConnection.getInputStream();
            byte[] buffer = new byte[1024];
            int readBytes;
            while ((readBytes = is.read(buffer)) != -1) {
                fos.write(buffer, 0, readBytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
