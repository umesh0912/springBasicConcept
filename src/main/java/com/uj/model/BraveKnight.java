package com.uj.model;

import com.uj.exceptions.QuestException;
import com.uj.interfces.Knight;
import com.uj.interfces.Quest;

public class BraveKnight implements Knight {
	private Quest quest;

	
	public BraveKnight(Quest quest) {
		this.quest = quest; // <co id="co_injectedQuest"/>
		
		System.out.println("In BraveKnight class defulat construtor");
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}