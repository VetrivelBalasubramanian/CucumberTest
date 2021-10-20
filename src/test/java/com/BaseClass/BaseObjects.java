package com.BaseClass;

import com.partytopics.Helpers.AlertHelper;
import com.partytopics.Helpers.AssertHelper;
import com.partytopics.Helpers.BrowserHelper;
import com.partytopics.Helpers.ButtonHelper;
import com.partytopics.Helpers.CheckBoxAndRadioButtonHelper;
import com.partytopics.Helpers.DropDownHelper;
import com.partytopics.Helpers.GeneralHelper;
import com.partytopics.Helpers.JavascriptHelper;
import com.partytopics.Helpers.LinkHelper;
import com.partytopics.Helpers.LoggerHelper;
import com.partytopics.Helpers.ProgressHelpers;

public interface BaseObjects {

	AlertHelper alertHelper = new AlertHelper();
	BrowserHelper browserHelper = new BrowserHelper();
	ButtonHelper buttonHelper = new ButtonHelper();
	CheckBoxAndRadioButtonHelper checkBoxAndRadioButtonHelper = new CheckBoxAndRadioButtonHelper();
	DropDownHelper dropDownHelper = new DropDownHelper();
	GeneralHelper generalHelper = new GeneralHelper();
	JavascriptHelper javascriptHelper = new JavascriptHelper();
	LinkHelper linkHelper = new LinkHelper();
	LoggerHelper loggerHelper = new LoggerHelper();
	ProgressHelpers progressHelpers = new ProgressHelpers();
	AssertHelper assertHelper = new AssertHelper();

}
