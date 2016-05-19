package com.session.TestRemoteEJB;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class RemoteEJBTest
 */
@Stateless
public class RemoteEJBTest implements RemoteEJBTestRemote {

    /**
     * Default constructor. 
     */
    public RemoteEJBTest() {
        // TODO Auto-generated constructor stub
    }
    public String getString()
    {
    	return "String WOW Remote";
    }
}
