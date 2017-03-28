package cn.yjxxclub.analysis.web;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.util.Properties;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-3-21
 * Time: 下午8:18
 * Describe: jpython test
 */
public class Test {
    public static void main(String []args){

        Properties props = new Properties();
        props.put("python.home", "path to the Lib folder");
        props.put("python.console.encoding", "UTF-8");

        props.put("python.security.respectJavaAccessibility", "false");

        props.put("python.import.site", "false");

        Properties preprops = System.getProperties();

        PythonInterpreter.initialize(preprops, props, new String[0]);
        PythonInterpreter interpreter = new PythonInterpreter();

        interpreter.execfile("/home/tengxing/JAVA-Development/workspace/yizhi/src/main/java/cn/yjxxclub/shijie/monitor/test.py");
        interpreter.exec("print 'created by tengxing on 2017.3!'");


        PyFunction func = (PyFunction) interpreter.get("adder",PyFunction.class);
        int a = 2010, b = 2;
        PyObject pyobj = func.__call__(new PyInteger(a), new PyInteger(b));
        System.out.println("anwser = " + pyobj.toString());

/*        Runtime rt = Runtime.getRuntime();
        try {

            Process proc = rt.exec("python /home/tengxing/JAVA-Development/workspace/yizhi/src/main/java/cn/yjxxclub/shijie/monitor/test.py");
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
