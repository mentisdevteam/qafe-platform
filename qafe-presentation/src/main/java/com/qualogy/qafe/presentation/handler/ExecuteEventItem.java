/**
 * Copyright 2008-2015 Qualogy Solutions B.V.
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
package com.qualogy.qafe.presentation.handler;

import java.util.Collection;

import com.qualogy.qafe.bind.core.application.ApplicationContext;
import com.qualogy.qafe.bind.presentation.event.Event;
import com.qualogy.qafe.bind.presentation.event.EventItem;
import com.qualogy.qafe.bind.presentation.event.function.BuiltInFunction;
import com.qualogy.qafe.core.datastore.DataIdentifier;
import com.qualogy.qafe.core.errorhandling.ExternalException;
import com.qualogy.qafe.core.framework.presentation.EventData;
import com.qualogy.qafe.presentation.EventHandlerImpl;

public interface ExecuteEventItem {
	/**
	 * 
	 * @param eventItem
	 * @param context
	 * @param event
	 * @param eventData
	 * @param listToExecute
	 * @param eventHandler
	 * @param dataId
	 * @return  boolean that denotes whether or not to stop the processing
	 * @throws ExternalException
	 */
	boolean execute(EventItem eventItem,ApplicationContext context, Event event, EventData eventData,Collection<BuiltInFunction> listToExecute,EventHandlerImpl eventHandler,DataIdentifier dataId) throws ExternalException;

	
}
