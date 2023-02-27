package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWhitDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependencia;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {


	private ComponentDependencia componentDependencia;
	private MyBean  myBean;
	private MyBeanWhitDependency myBeanWhitDependency;

	public FundamentosApplication(@Qualifier("componentTowImplement") ComponentDependencia componentDependencia, MyBean myBean,MyBeanWhitDependency myBeanWhitDependency){
		this.componentDependencia = componentDependencia;
		this.myBean = myBean;
		this.myBeanWhitDependency = myBeanWhitDependency;
	}

	/* misma forma de hacer lo de arriba
	* @Autowired
	@Qualifier("componentTowImplement")
	private ComponentDependencia componentDependencia;
	*
	* */
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		this.componentDependencia.saludar();
		// usar la implementacion de myBean
		this.myBean.print();
		this.myBeanWhitDependency.printWhitDependency();
	}


}
