package setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCompany {

	public static void main(String[] args) 
	{
		Resource res = new ClassPathResource("company.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		Company c = (Company)bean.getBean("comps");
		c.display();
		
	}

}
