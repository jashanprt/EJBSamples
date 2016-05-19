package com.session.EJBTest;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EJBTest
 */
@Stateless
@LocalBean
public class EJBTest {

    /**
     * Default constructor. 
     */
    public EJBTest() {
        // TODO Auto-generated constructor stub
    }

    public String getString()
    {
    	return "String WOW";
    }
}
