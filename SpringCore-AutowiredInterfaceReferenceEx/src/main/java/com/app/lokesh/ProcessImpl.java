package com.app.lokesh;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* container  auto select if we use @Primary annotation (Default)
 * on top of the class [container auto suggest object]
  */
//@Primary
public class ProcessImpl implements Iprocess {
	@Override
	public void getProcessCode() {
		System.out.println("process method code");
	}
	
	
}
