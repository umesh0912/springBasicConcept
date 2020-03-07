package com.uj.model;

import com.uj.exceptions.QuestException;
import com.uj.interfces.Quest;

public class SlayDragonQuest implements Quest {
	
	 public SlayDragonQuest() {
		// TODO Auto-generated constructor stub
		 System.out.println("In SlayDragonQuest class defulat construtor");
	}

	  public void embark() throws QuestException {
	    System.out.println("Slaying Dragon!");
	  }

	}