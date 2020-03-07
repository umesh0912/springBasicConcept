package com.us.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uj.interfces.Knight;

public class KnightMain {
	  public static void main(String[] args) {
	    @SuppressWarnings("resource")
		ApplicationContext context = 
	        new ClassPathXmlApplicationContext("springConfig.xml"); //<co id="co_loadKnightContext"/>
		/*ApplicationContext --> when new ClassPathXmlApplicationContext("configFilePath") is initated at that time all bean objects gest created*/	   	
		
//		  @SuppressWarnings("resource")
//		BeanFactory context = new XmlBeanFactory(new ClassPathResource("springConfig.xml")); 
	    
	    Knight knight = (Knight) context.getBean("knight"); //<co id="co_getBeanKnight"/>
	    /* BeanFactory --> when context.getBean("beanId") is called at that time all bean onjects gets created */
	    knight.embarkOnQuest();//<co id="co_useKnight"/>
	  }
	}