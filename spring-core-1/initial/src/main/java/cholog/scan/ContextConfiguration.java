package cholog.scan;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
ComponentScan에 대해 학습하고, ComponenetScanBean을 Bean으로 등록하기
 */
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class)
})
/*
FilterType.CUSTOM   //사용자가 정의한 커스텀 필터.
TypeExcludeFilter   //일반적으로 SpringBoot 테스트에 사용. 테스트 구성 시 일부 컴포넌트를 제외하는 데 사용.
AutoConfigurationExcludeFilter      //SpringBoot의 Auto-Configuration(자동 구성) 대상에서 특정 자동 구성 클래스들을 제외하기 위해 사용.
*/
public class ContextConfiguration {
}
