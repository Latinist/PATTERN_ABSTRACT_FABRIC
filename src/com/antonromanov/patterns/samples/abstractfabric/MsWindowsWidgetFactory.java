package com.antonromanov.patterns.samples.abstractfabric;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {
	
	//create an MSWindow
	  public Window createWindow(){
	    MSWindow window = new MSWindow();
	    return window;
	
	  }
}
