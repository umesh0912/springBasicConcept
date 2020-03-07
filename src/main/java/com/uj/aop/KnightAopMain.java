package com.uj.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uj.interfces.Knight;

public class KnightAopMain {
	  public static void main(String[] args) {
	    @SuppressWarnings("resource")
		ApplicationContext context = 
	        new ClassPathXmlApplicationContext("knights-aop.xml");
	    
	    Knight knight = (Knight) context.getBean("knight");
	    
	    knight.embarkOnQuest();
	  }
	}