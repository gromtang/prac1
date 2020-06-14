import java.io.*;

public class IOTest {

    public static void main(String[] args) throws IOException {

        /*FileOutputStream fos = null;

        fos = new FileOutputStream("D:\\IOTest.txt",true);
        try {
            fos.write("\r\nappend".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        FileInputStream fis = new FileInputStream("D:\\IOTest.txt");
        /*try {
            int rd = fis.read();
            System.out.print(rd + "\r\n");
            System.out.print((char) rd);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*int flag = 0;
        while ((flag = fis.read()) != -1){
            System.out.print((char) flag);
        }
        fis.close();*/

        /*
        FileOutputStream fos = new FileOutputStream("D:\\IOTest2.txt");
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
        */
        //高效一次一个数组法，但最后多了一个字节
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\IOTest.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\IOTest3.txt"));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bos.write(bis.read());
        bis.close();
        bos.close();
    }
}
