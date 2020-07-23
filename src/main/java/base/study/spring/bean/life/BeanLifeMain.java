package base.study.spring.bean.life;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeMain {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:**/spring-bean-life.xml");
            CustomBean bean = context.getBean(CustomBean.class);
            System.out.println("################ 实例化、初始化bean完成");
            System.out.println("****************下面输出结果");
            System.out.println("描述：" + bean.getDesc());
            System.out.println("备注：" + bean.getRemark());
        }
}