package base.study.spring.bean.life;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("第一步：调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
		BeanDefinition bd = beanFactory.getBeanDefinition("customBean");
		MutablePropertyValues pv =  bd.getPropertyValues();
		pv.addPropertyValue("remark", "在BeanFactoryPostProcessor中修改之后的备忘信息");
		pv.addPropertyValue("desc", "在BeanFactoryPostProcessor中修改之后的描述信息");
	}

}