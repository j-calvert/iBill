package com.hydro4ge.mycircle.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.Window;

public class MyCircle implements EntryPoint {
  public void onModuleLoad() {
    MyDrawing d = new MyDrawing(Window.getClientWidth(),
        Window.getClientHeight());
    RootPanel.get().add(d);
  }
}
