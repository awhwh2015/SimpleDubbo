package pers.wh.simple.dubbo.demo.consumer;

import org.springframework.stereotype.Service;
import pers.wh.simple.dubbo.demo.api.HelloWorld;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by wanghan on 2017/5/9.
 */
@Service
public class TestHello {
    @Resource(name="sayWorld")
    private HelloWorld helloWorld;

    @PostConstruct
    public void init(){
        helloWorld.sayHello();

    }
}
