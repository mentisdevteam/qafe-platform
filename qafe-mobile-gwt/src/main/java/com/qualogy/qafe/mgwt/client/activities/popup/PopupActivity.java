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
package com.qualogy.qafe.mgwt.client.activities.popup;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.dialog.ConfirmDialog.ConfirmCallback;
import com.googlecode.mgwt.ui.client.dialog.Dialogs.ButtonType;
import com.googlecode.mgwt.ui.client.dialog.Dialogs.OptionCallback;
//import com.googlecode.mgwt.ui.client.dialog.Dialogs.OptionsDialogOption;
import com.qualogy.qafe.mgwt.client.DetailActivity;
import com.qualogy.qafe.mgwt.client.main.ClientFactory;

/**
 * @author Daniel Kurka
 * 
 */
public class PopupActivity extends DetailActivity {

	private final ClientFactory clientFactory;

	public PopupActivity(ClientFactory clientFactory) {
		super(clientFactory.getPopupView(), "nav");
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		super.start(panel, eventBus);
		final PopupView view = clientFactory.getPopupView();

		view.getBackbuttonText().setText("UI");
		view.getHeader().setText("Popups");
		view.getMainButtonText().setText("Nav");

		addHandlerRegistration(view.getConfirmButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
				view.confirmSomeStuff("Confirm this", "Confirm some more stuff", new ConfirmCallback() {

					@Override
					public void onOk() {

					}

					@Override
					public void onCancel() {

					}
				});

			}
		}));

		addHandlerRegistration(view.getSlideUpButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
//				List<OptionsDialogOption> list = new ArrayList<OptionsDialogOption>();
//				list.add(new OptionsDialogOption("Confirm", ButtonType.CONFIRM));
//				list.add(new OptionsDialogOption("Cancel", ButtonType.NORMAL));
//				list.add(new OptionsDialogOption("Delete", ButtonType.IMPORTANT));
//
//				view.showSomeOptions(list, new OptionCallback() {
//
//					@Override
//					public void onOptionSelected(int index) {
//
//					}
//				});
			}
		}));

		addHandlerRegistration(view.getAlertButton().addTapHandler(new TapHandler() {

			@Override
			public void onTap(TapEvent event) {
				view.alertSomeStuff("Hi", "How are you doing?");
			}
		}));

		panel.setWidget(view);
	}
}
