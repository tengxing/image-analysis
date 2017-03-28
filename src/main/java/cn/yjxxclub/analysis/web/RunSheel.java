package cn.yjxxclub.analysis.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-3-28
 * Time: 下午9:26
 * Describe:
 */
public class RunSheel {
    public static void main(String[] args){
        try {
            String shpath="/home/tengxing/tmp/test/java.sh 11.jpg";
            Process ps = Runtime.getRuntime().exec(shpath);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
