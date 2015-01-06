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
package com.qualogy.qafe.gwt.client.vo.functions.execute;

import com.qualogy.qafe.gwt.client.vo.functions.BuiltInFunctionGVO;
import com.qualogy.qafe.gwt.client.vo.functions.SetRestrictionGVO;

public class SetRestrictionExecute implements ExecuteCommand {

	public void execute(BuiltInFunctionGVO builtInFunction) {
		if (builtInFunction instanceof SetRestrictionGVO) {
			SetRestrictionGVO setRestrictionGVO = (SetRestrictionGVO)builtInFunction;
			
			// The window should be opened after adding all authorization rules,
			// so when opening the window those rules will be executed in WindowRenderer,
			// so be aware of the order of execution of built-ins
			String applicationId = setRestrictionGVO.getApplicationId();
			String windowId = setRestrictionGVO.getWindowId();
			RestrictionsExecutor.getInstance().add(windowId, applicationId, setRestrictionGVO);	
		}	
		FunctionsExecutor.setProcessedBuiltIn(true);		
	}
}
