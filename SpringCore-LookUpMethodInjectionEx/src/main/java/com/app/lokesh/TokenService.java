package com.app.lokesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
// Dependent [parent]
public class TokenService {
	@Autowired
	private Token token;

	public Token getToken() {
		//call this method either getter or toString ..
		token = getNewTokenObj();
		return token;
	}

	/* Lookup(-) method problem solution [Lookup(-) method Injection]
	 *  to solve the problem we have to follow some steps
	 *  write one method which will take child[Dependency] as return type
	 *  return null
	 *  and add @Lookup annotation on top of the method
	 *  then remaining things container will take care :)
	  */
	
	@Lookup
	public Token getNewTokenObj() {
      // method body provided by spring container only
		return null;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}

}
