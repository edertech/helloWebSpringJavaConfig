package br.com.edertech.sample.web.controller;import javax.inject.Inject;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.RequestMapping;import br.com.edertech.sample.domain.service.HelloService;/*** *  * Spring MVC Controller *  * @author edertech *  */@Controllerpublic class HelloController {	@Inject	private HelloService helloService;		@RequestMapping("/hello")	public String hello(Model model) {		model.addAttribute("hello", getHelloService().getHello());				return "hello";	}		private HelloService getHelloService() {	    return helloService;    }}