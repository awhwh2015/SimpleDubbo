package pers.wh.simple.dubbo.demo.provider;

import org.springframework.stereotype.Service;
import pers.wh.simple.dubbo.demo.api.HelloWorld;

/**
 * Created by wanghan on 2017/5/8.
 */
@Service("helloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
