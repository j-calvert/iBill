package com.hydro4ge.dnd.client;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

  // the following code was copied almost verbatim from
  //   http://code.google.com/p/gwt-dnd/wiki/GettingStarted
  //
  // simply replacing Image with DraggableCircle, defined in this package

  public void onModuleLoad() {
	// ensure the document BODY has dimensions in standards mode
	RootPanel.get().setPixelSize(600, 600);

	// workaround for GWT issue 1813
	// http://code.google.com/p/google-web-toolkit/issues/detail?id=1813
	RootPanel.get().getElement().getStyle().setProperty("position" , "relative");

	// create a DragController to manage drag-n-drop actions
	// note: This creates an implicit DropController for the boundary panel
	PickupDragController dragController = new PickupDragController(RootPanel.get(), true);

	// add a new circle to the boundary panel and make it draggable
    DraggableCircle d = new DraggableCircle(30);
	RootPanel.get().add(d, 40, 30);
	dragController.makeDraggable(d);
  }
 
}

