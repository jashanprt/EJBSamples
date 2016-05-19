package com.session.TestRemoteEJB;

import javax.ejb.Remote;

@Remote
public interface RemoteEJBTestRemote {
	public String getString();
}
