package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u144/9417/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, July 21, 2017 9:58:29 PM PDT
*/


/**
	 * IdAssignmentPolicy specifies whether Object Ids in 
	 * the created POA are generated by the application or 
	 * by the ORB. The default is SYSTEM_ID.
	 */
public interface IdAssignmentPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.IdAssignmentPolicyValue value ();
} // interface IdAssignmentPolicyOperations