package com.uj.aop;

import com.uj.exceptions.QuestException;
import com.uj.interfces.Quest;

public class MakeRoundTableRounderQuest implements Quest {

	  public void embark() throws QuestException {
	    System.out.println("Making round table rounder");
	  }

	}