/*if we want to call any class static method(class/interface) then we have to write like this
 * 	@Value("#{T(java.lang.Math).multiplyExact(45,45) }") where T (type)=> class/Interface
 * 
 * 											and 
 * 
 * if we want to call any class instance method (object/reference) then we have to write like this
 * //	@Value("#{ new java.util.Random().nextInt()}")
 * 
 * 
 * 			if we want to access another class variable value then we have to write like this
 * 			@Value("#{progressData.model}") [className.variableName]
 * 
 */
package com.app.lokesh;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Progress {
//	@Value("#{5*4}")
//	@Value("#{'HeyBuddy'.length()}")
//	@Value("#{'HeyBuddy'.length()>0 ? 34:88}")
//	@Value("#{ 'Hello'.charAt(0)}")
//	@Value("#{ new java.util.Random().nextInt()}")
//	@Value("#{ T(java.lang.Math).abs(new java.util.Random().nextInt())}")
//	@Value("#{T(java.lang.Math).multiplyExact(45,45) }")
//	@Value("#{progressData.model}")
//	@Value("#{progressData.model.getBytes()}")
//	@Value("#{progressData.model.toCharArray()}")
//	@Value("#{progressData.model.replace( 'M','T')}")
	@Value("#{progressData.model.lines()}")
	private Stream<String> code;
//	private char[] array;
//	private byte[] array;
//	private Integer code;

	@Override
	public String toString() {
		return "Progress [code=" + code + "]";
	}

	/*
	 * @Override public String toString() { return "Progress [array=" +
	 * Arrays.toString(array) + "]"; }
	 */
	/*
	 * @Override public String toString() { return "Progress [array=" +
	 * Arrays.toString(array) + "]"; }
	 */

	/*
	 * @Override public String toString() { return "Progress [code=" + code + "]"; }
	 */

}
