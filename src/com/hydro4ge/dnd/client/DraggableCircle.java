package com.hydro4ge.dnd.client;

import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.hydro4ge.raphaelgwt.client.*;

class DraggableCircle extends Raphael
	implements HasMouseDownHandlers, HasMouseUpHandlers, HasMouseMoveHandlers, HasMouseOutHandlers
{
  static final private int PADDING = 5;
  private int radius;

  public DraggableCircle(int radius) {
	super((radius+PADDING)*2, (radius+PADDING)*2);
	this.radius = radius;
  }

  @Override
  public void onLoad() {
	super.onLoad();
	Circle c = new Circle(this.radius+PADDING, this.radius+PADDING, this.radius);
	c.attr("fill", "#666");
  }

  public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
	return this.addDomHandler(handler, MouseDownEvent.getType());
  }

  public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
	return this.addDomHandler(handler, MouseUpEvent.getType());
  }

  public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
	return this.addDomHandler(handler, MouseMoveEvent.getType());
  }

  public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
	return this.addDomHandler(handler, MouseOutEvent.getType());
  }
}

