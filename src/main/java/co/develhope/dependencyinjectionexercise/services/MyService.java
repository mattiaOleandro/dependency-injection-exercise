package co.develhope.dependencyinjectionexercise.services;

import co.develhope.dependencyinjectionexercise.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    public MyService(){
        System.out.println("MyService() is invoked");
    }

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService() is invoked");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyComponent.getMyComponentName() is invoked");
        return myComponent.getMyComponentName();
    }
}
