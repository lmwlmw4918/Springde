import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.*;
@RunWith(SpringJUnit4ClassRunner.class)
public class test1  {

    @Test

    public void test()  throws Exception{
//        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        applicationContext.registerShutdownHook();
//        ApplicationContext a=new FileSystemXmlApplicationContext();

        List<Integer> list = new ArrayList<>();
        String name="bob";
        int i = name.hashCode();
        System.out.println(i);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        for(Integer in:list){
            System.out.println(in);
        }
//        FileReader io=new  FileReader("D:\\IntelliJ IDEA 2021.3.2\\Install-Windows-zip.txt");
//
//char bytes[]=new char[1024];
//        int by;
// while ((by=io.read(bytes))!=-1){
//     System.out.println(new String(bytes,0,by));
//
//        }
// io.close();
//
//
//    }
    }
}