package com.zyla.health.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/find")
public class Controller {
	
	HashMap<Long,Integer> map = new HashMap<Long,Integer>();
	long number = 1111111111;
	long maxNumber = number;
	
	@RequestMapping(value = "/add/{number}", method = RequestMethod.POST)
	public void addNumber(@PathVariable(value = "number") Long number){
		long start = System.currentTimeMillis();
		for(long i = 1111111119L ;i< number; i++){
			map.put(i, 1);
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken by api :"+(end-start));
		System.out.println(map.size());
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Long findNumber(){
		long start = System.currentTimeMillis();
		if(maxNumber <= 9999999999L){
			while(map.containsKey(number)){
				map.remove(number);
				number++;
			}
			maxNumber = number;
			long end = System.currentTimeMillis();
			System.out.println("time taken by api :"+(end-start));
			System.out.println(map.size());
			return number++;
		}else{
			return 0L;
		}
		
	}
	@RequestMapping(value = "/{fancyNumber}", method = RequestMethod.GET)
	public Long findfancyNumber(@PathVariable(value = "fancyNumber") Long fancyNumber) {
	//	System.out.println("APi started");
		long start = System.currentTimeMillis();
	   if(fancyNumber <= 9999999999L && fancyNumber >=1111111111L){
			if(maxNumber >= fancyNumber ){
				while(map.containsKey(number)){
					map.remove(number);
					number++;
				}
		
				maxNumber = number;
				long end = System.currentTimeMillis();
				System.out.println("time taken by api :"+(end-start));
				System.out.println(map.size());
				return number++;
			}else{
				if(map.containsKey(fancyNumber)){
					while(map.containsKey(number)){
						map.remove(number);
						number++;
					}
				
					maxNumber = number;
					long end = System.currentTimeMillis();
					System.out.println("time taken by api :"+(end-start));
					System.out.println(map.size());
					return number++;
				}else{
				  map.put(fancyNumber, 1);
				  long end = System.currentTimeMillis();
				  System.out.println("time taken by api :"+(end-start));
				  System.out.println(map.size());
				  return fancyNumber;
				}
				
			}
	   }else{
		   return 0L;
	   }
	}
}
