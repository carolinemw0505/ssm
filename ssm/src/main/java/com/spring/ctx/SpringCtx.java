package com.spring.ctx;

import javafx.fxml.Initializable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-234678963)
public class SpringCtx implements ApplicationContextInitializer {
    private static SpringCtx m;
    private ApplicationContext ctx;

    public SpringCtx(){

    }

    public ApplicationContext getCtx(){
        return this.ctx;
    }

    public static SpringCtx instance(){return m;}

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        this.ctx=configurableApplicationContext;
        m=this;
    }
}
