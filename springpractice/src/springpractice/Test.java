package springpractice;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationcontext.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		Student s = (Student)bean.getBean("s");
		s.display();
		s.m();
		s.map();
	}

}
