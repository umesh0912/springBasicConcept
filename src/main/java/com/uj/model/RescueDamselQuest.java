package com.uj.model;

import com.uj.exceptions.QuestException;
import com.uj.interfces.Quest;

public class RescueDamselQuest implements Quest {
	public void embark() throws QuestException {
		System.out.println("Rescuing damsel in distress");
	}
}