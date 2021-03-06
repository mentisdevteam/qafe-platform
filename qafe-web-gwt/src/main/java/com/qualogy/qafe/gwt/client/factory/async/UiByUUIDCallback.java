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
package com.qualogy.qafe.gwt.client.factory.async;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.qualogy.qafe.gwt.client.context.ClientApplicationContext;
import com.qualogy.qafe.gwt.client.factory.WindowFactory;
import com.qualogy.qafe.gwt.client.vo.functions.execute.FunctionsExecutor;
import com.qualogy.qafe.gwt.client.vo.ui.UIGVO;

public class UiByUUIDCallback implements AsyncCallback<Object> {

	String windowId = null;
	
	
	public String getWindowId() {
		return windowId;
	}

	public void setWindowId(String windowId) {
		this.windowId = windowId;
	}

	public void onSuccess(Object result) {
		UIGVO ui = (UIGVO) result;
		ClientApplicationContext.getInstance().setPrerenderingUIVO(ui.getAppId(), ui);
		WindowFactory.createWindow(ui, getWindowId());
		ClientApplicationContext.getInstance().setBusy(false);

		FunctionsExecutor.setProcessedBuiltIn(true);
	}

	public void onFailure(Throwable caught) {
		ClientApplicationContext.getInstance().log("Getting window from server failed", "Error creating dynamic panel", true, true, caught);
		ClientApplicationContext.getInstance().setBusy(false);

		FunctionsExecutor.setProcessedBuiltIn(true);
	}
}
