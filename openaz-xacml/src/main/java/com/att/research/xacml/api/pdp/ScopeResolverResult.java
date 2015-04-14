/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */

/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */
package com.att.research.xacml.api.pdp;

import java.util.Iterator;

import com.att.research.xacml.api.Attribute;
import com.att.research.xacml.api.Status;

/**
 * ScopeResolverResult is the interface for objects returned by the {@link ScopeResolver}'s
 * <code>resolveScope</code> method.
 * 
 * @author car
 * @version $Revision$
 */
public interface ScopeResolverResult {
	/*
	 * Gets the {@link com.att.research.xacml.api.Status} for the scope resolution request.
	 * 
	 * @return the <code>Status</code> of the scope resolution request
	 */
	public Status getStatus();
	
	/*
	 * Gets an <code>Iterator</code> over {@link com.att.research.xacml.api.Attribute}s resolved from a scope resolution request.
	 * 
	 * @return an <code>Iterator</code> over the <code>Attribute</code>s resolved from a scope resolution request.
	 */
	public Iterator<Attribute> getAttributes();
}
