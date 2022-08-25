package co.develhope.dependencyinjectionexercise.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent() is invoked");
        this.myComponentName = "Mattia";
    }

    public String getMyComponentName() {
        return myComponentName;
    }

    public void setMyComponentName(String myComponentName) {
        this.myComponentName = myComponentName;
    }
}
