package com.session.ContextRemoteEJBTest;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class COntextRemoteEJBTest
 */
@Stateless(name = "CustJNDI", mappedName="CustJNDI")
public class ContextRemoteEJBTest implements ContextRemoteEJBTestRemote {

    /**
     * Default constructor. 
     */
    public ContextRemoteEJBTest() {
        // TODO Auto-generated constructor stub
    }
    public String getString()
    {
    	return "String WOW Remote Context";
    }
}
