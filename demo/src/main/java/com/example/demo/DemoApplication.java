package com.example.demo;

import java.util.function.Function;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class DemoApplication {

	public static void main(String[] args) {
		// Employee employee = () -> "Software Engineer";   // a simple lambda expression
		// System.out.println(employee.getName());

		// Runnable runnable =() -> {
		// 	for(int i=0;i<=10;i++){
		// 		System.out.println("hello "+1);
		// 	}
		// };
		// Thread childthread=new Thread(runnable);  // use of runnable functional interface
		// childthread.run();

		// ArrayList<Integer> list=new ArrayList<>();
		// list.add(1);
		// list.add(5);
		// list.add(2);
		// list.add(0);
		// Collections.sort(list,(a,b) -> b-a);  // use of complarable functional interface
		// System.out.println(list);

		// Student s1=new Student("shukla",2);
		// Student s2=new Student("gupta",3);
		// Student s3=new Student("goel",1);

		// List<Student> li=new ArrayList<>();
		// li.add(s1);
		// li.add(s2);
		// li.add(s3);

		// Collections.sort(li, (a,b) -> a.id-b.id);
		// System.out.println(li);

		// Predicate<Integer> isEven = x -> x%2==0;    // use of predicate functional interface
		// List<Integer> li=Arrays.asList(1,2,3,4);
		// for(Integer i:li){
		// 	if(isEven.test(i)){
		// 		System.out.println(i);
		// 	}
		// }
		// Predicate<String> hello =x -> x.toLowerCase().charAt(0)=='a';
		// System.out.println(hello.test("bout"));

		Function<String,Integer> function =x -> x.length();   // use of Function functional interface
		System.out.println(function.apply("utkarsh"));  //7

		Function<Integer,Integer> function1=x-> 2*x;
		Function<Integer,Integer> function2=x->x*x;
		System.out.println(function1.andThen(function2).apply(2)); //16
		System.out.println(function2.andThen(function1).apply(2)); //8
		System.out.println(function1.compose(function2).apply(2));  //8

		//SpringApplication.run(DemoApplication.class, args);
		
	}
}


// 	static class Student {

// 		public String name;
// 		public Integer id;

// 		Student(String name,Integer id){
// 			this.id=id;
// 			this.name=name;
// 		}

// 		public String toString(){
// 			return this.id + ":" +this.name;
// 		}
// 	}
// }


