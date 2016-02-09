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
/**
 * 
 */
package com.qualogy.qafe.mgwt.client.vo.ui;


/**
 * @author rjankie 
 *   This is the superclass of all the editable components which will be
 *   rendered as graphical controls.
 */

public  class ImageGVO extends ComponentGVO{

	private String parent=null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 236597784352073742L;
	
	/**
	 * 
	 */
	protected String imageLocation;
	
	/**
	 * 
	 */
	protected String description;

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getClassName() {
		return "com.qualogy.qafe.gwt.client.vo.ui.ImageGVO";
	}

	public String getParent() {
		return parent;
	}

	public boolean hasParent() {
		return (parent!=null);
	}
	public void setParent(String parent){
		this.parent=parent;
	}


	

}
