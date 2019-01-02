package com.naresh.firstlesson.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.firstlesson.products.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/naresh/firstlesson/test/config.xml");
    	
    	Product product = (Product) context.getBean("product");
    	System.out.println(product.toString());
    }
}
