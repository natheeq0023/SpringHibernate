package constructorinjection;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationcontext.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		Student s = (Student)bean.getBean("s1");
		Student s1 = (Student)bean.getBean("s4");
		s.display();
		//s.m();
		s1.map();
	}

}
