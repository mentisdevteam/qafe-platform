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
package com.qualogy.qafe.bind.resource.query;

import java.util.ArrayList;
import java.util.List;

public class MetaData {
	
	private boolean supportsGetGeneratedKeys;
	
	private List primaryKeys = new ArrayList();
	
	public List getPrimaryKeys(){
		return primaryKeys;
	}

	public String[] getPrimaryKeysToArray(){
		return (String[])primaryKeys.toArray(new String[primaryKeys.size()]);
	}
	
	public void addPrimaryKey(String primaryKey) {
		this.primaryKeys.add(primaryKey);
	}

	public boolean supportsGetGeneratedKeys() {
		return supportsGetGeneratedKeys;
	}

	public void setSupportsGetGeneratedKeys(boolean supportsGetGeneratedKeys) {
		this.supportsGetGeneratedKeys = supportsGetGeneratedKeys;
	}
}
