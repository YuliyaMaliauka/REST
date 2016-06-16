package com.datalex.entity;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

public class RestfulAdage extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(CustomerResource.class);
		return set;
	}
}
