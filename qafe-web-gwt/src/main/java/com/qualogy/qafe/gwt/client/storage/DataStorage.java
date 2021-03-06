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
package com.qualogy.qafe.gwt.client.storage;


public interface DataStorage {

	String KEY_ERROR_MESSAGE = "$ERROR_MESSAGE";
	String KEY_WORD_QAFE_BUILT_IN_LIST = "QAFE_BUILT_IN_LIST";
	
    void storeData(String dataId, String name, Object data);
    void removeData(String dataId);
    void removeData(String dataId, String name);
    Object getData(String dataId, String name);
    String register();
    void unregister(String dataId);
}
