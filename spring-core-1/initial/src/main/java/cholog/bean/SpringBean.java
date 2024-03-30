package cholog.bean;

import org.springframework.stereotype.Component;

/*
어떤 어노테이션을 붙였을 때 Bean으로 생성되는지 학습하기
 */
@Component      //클래스에 @Component 어노테이션 추가 → 스프링 빈으로 등록됨
public class SpringBean {
    public String hello() {
        return "Hello";
    }
}
