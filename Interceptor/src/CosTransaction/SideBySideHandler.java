package CosTransaction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import SideBySideSeat.*;
public class SideBySideHandler implements InvocationHandler{
	SideBySide handlerSideBySide;
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Catch by SideBySideHandler :"+arg0.getClass().getSimpleName());
		System.out.println("Catch by SideBySideHandler :"+arg1.getName());
		return null;
	}

}