/**
 * Copyright 2008-2016 Qualogy Solutions B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qualogy.qafe.core.framework.business;

import com.qualogy.qafe.bind.core.application.ApplicationContext;
import com.qualogy.qafe.bind.integration.service.ServiceRef;
import com.qualogy.qafe.core.datastore.DataIdentifier;
import com.qualogy.qafe.core.errorhandling.ExternalException;
/**
 * generic interface for processing integration references 
 * @author 
 *
 */
public interface IntegrationProcessor{
	/**
	 * Generic process method for processing serviceRefs based upon a certain context
	 * and data for specified dataId
	 * @param context
	 * @param dataId
	 * @param serviceRef
	 * @throws UnableToProcessException
	 */
	public void process(ApplicationContext context, DataIdentifier dataId, ServiceRef serviceRef) throws ExternalException;
}
