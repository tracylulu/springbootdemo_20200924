package com.h3c.cll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.h3c.cll.entity.Person;
import com.h3c.cll.entity.TestObject;


@SpringBootApplication
@ComponentScan
@EnableAsync
public class Application {

	public static void main(String[] args) {

		/*System.out.println("11111111");
		System.out.println("222");
		System.out.println("333");
		System.out.println("444");
		System.out.println("555");
		System.out.println("66");
		System.out.println("77");
		System.out.println("88");*/
		
		List<TestObject> list = Arrays.asList(
				new TestObject("Ron","M",10,"ron.zheng@tfschange.com",false),
				new TestObject("KDS","W",10,"kds@qq.com",false),
				new TestObject("BoDuo","W",30,"boduo@163.com",false),
				new TestObject("CangJin","W",10,"cangjin@gmail.com",false),
				new TestObject("XiaoZe","W",30,"xiaoze@hotmail.com",true),
				new TestObject("James","M",10,"leblonjames@hotmail.com",true),
				new TestObject("Allen","M",50,"allen.lei@tfschange.com",true),
				new TestObject("Smith","M",10,"jr.smith@cel.com",true),
				new TestObject("Wade","M",20,"dw.wade@cel.com",true),
				new TestObject("Wade","M",20,"dw.wade@cel.com",false)
				);
		/*System.out.println(list);
		List<TestObject> collect = list.stream().filter(TestObject::isMng).collect(Collectors.toList());
		collect.stream().forEach(u->System.out.println(u.getName()));
		
		list.stream().filter(u->u.getSex().equals("M")).limit(5).
		sorted(Comparator.comparing(TestObject::getName)).
		forEach(u->System.out.println(u.getName()));
		
		list.stream().map(TestObject::getName).collect(Collectors.toList()).
		forEach(System.out::println);
		
		Optional<TestObject> optional = list.stream().filter(u->u.getName().equals("Ron")).findAny();
		if(optional.isPresent()) {
			System.out.println(optional.get().getName());
		}
		list.stream().filter(u->u.isMng()).findFirst().
		ifPresent(u->System.out.println(u.getName()));
		*/
		//System.out.println((x)->5*x);
		
		/*List<String> collect = list.stream().map(TestObject::getName).sorted().limit(2).collect(Collectors.toList());
		collect.stream().forEach(u->System.out.println(u.getBytes()));*/
		
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("jack", 20));
		personList.add(new Person("ak", 25));
		personList.add(new Person("ak47", 25));
		personList.add(new Person("tom", 30));
		Map<String,List> map=new HashMap<>();
		map.put("p", personList);
		/*List<Person> collect = personList.stream().filter(u->u.getName().equals("tom")).collect(Collectors.toList());
		System.out.println(collect);
		collect.forEach(u->System.out.println(u.getAge()));
		
		List<Person> collect2 = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		collect2.forEach(u->System.out.println(u.getAge()));
		System.out.println(collect2);*/
		
		List<Integer> collect3 = personList.stream().map(Person::getAge).collect(Collectors.toList());
		
		System.out.println(personList.stream().anyMatch(u->u.getAge()==20));
		
		Optional<Person> findFirst = personList.stream().filter(u->u.getAge()==20).findFirst();
		
		
		System.out.println(collect3.get(0));
		
		
		String collect = personList.stream().map(Person::getName).collect(Collectors.joining());
		System.out.println(collect);
		Map<Integer, List<Person>> map2 = personList.stream().collect(Collectors.groupingBy(Person::getAge));
		for (Iterator iterator = collect3.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		
		SpringApplication.run(Application.class, args);

	}
}
