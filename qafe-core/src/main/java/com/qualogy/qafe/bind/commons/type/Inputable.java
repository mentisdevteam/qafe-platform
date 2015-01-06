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
package com.qualogy.qafe.bind.commons.type;

import java.util.List;

/**
 * This interface helps in finding the input variables which are needed
 * for the processing of the events triggered from clientside to send this as inputvalues
 * for this event.
 * @author rjankie
 *
 */
public interface Inputable {

	public Reference getRef();
	
	public String getName();
	
	public Value getValue();
	
	public List getPlaceHolders();
	
	public boolean hasPlaceHolders();
}
