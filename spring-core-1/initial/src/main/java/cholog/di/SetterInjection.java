package cholog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjection {
    private InjectionBean injectionBean;

    /*
    Setter Injection으로 InjectionBean 주입받기
     */
    @Autowired      //Setter 만들고 @Autowired도 써줘야 함
    public void setInjectionBean(InjectionBean injectionBean) {
        this.injectionBean = injectionBean;
    }

    public String sayHello() {
        return injectionBean.hello();
    }
}
