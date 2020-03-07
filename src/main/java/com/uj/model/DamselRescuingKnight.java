package com.uj.model;

import com.uj.exceptions.QuestException;
import com.uj.interfces.Knight;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		quest = new RescueDamselQuest(); // <co id="co_coupledToQuest"/>
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}