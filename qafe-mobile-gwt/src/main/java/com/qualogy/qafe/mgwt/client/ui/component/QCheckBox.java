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
package com.qualogy.qafe.mgwt.client.ui.component;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.googlecode.mgwt.ui.client.widget.MCheckBox;
import com.qualogy.qafe.mgwt.client.ui.events.DataChangeHandler;

public class QCheckBox extends MCheckBox implements IsEditable, HasDisplayname, HasSelection {

	private String checkedValue = null;
	private String uncheckedValue = null;
	private String dataName;
	
	public QCheckBox(String text) {
		setTitle(text);
		initialize();
	}
	
	private void initialize() {
		addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				Object newData = getData();
				ComponentHelper.fireDataChange(QCheckBox.this, newData, null);
			}
		});
	}
	
	@Override
	public HandlerRegistration addDataChangeHandler(DataChangeHandler handler) {
		return ComponentHelper.addDataChangeHandler(this, handler);
	}
	
	@Override
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	@Override
	public String getDataName() {
		return dataName;
	}

	@Override
	public void setData(Object data) {
		Boolean value = ComponentHelper.toBoolean(data, checkedValue, uncheckedValue, false);
		Object oldData = getData();
		super.setValue(value);
		Object newData = getData();
		ComponentHelper.handleDataChange(this, newData, oldData);
	}

	@Override
	public Object getData() {
		Boolean checked = super.getValue();
		if (checked) {
			if (checkedValue != null) {
				return checkedValue;
			}
		} else {
			if (uncheckedValue != null) {
				return uncheckedValue;
			}
		}
		return checked;
	}
	
	@Override
	public Object getDataModel() {
		return getData();
	}

	@Override
	public Object getModel() {
		return getData();
	}
	
	public void setCheckedValue(String checkedValue) {
		this.checkedValue = checkedValue;
	}
	
	public void setUncheckedValue(String uncheckedValue) {
		this.uncheckedValue = uncheckedValue;
	}

	@Override
	public void setEditable(boolean editable) {
		setReadOnly(!editable);
	}

	@Override
	public String getDisplayname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDisplayname(String displayname) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setSelected(Object value) {
		setData(value);
	}
}