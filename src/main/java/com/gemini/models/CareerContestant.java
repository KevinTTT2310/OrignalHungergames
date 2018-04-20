package com.gemini.models;

public class CareerContestant extends Contestant {

    public double getTraining() {
        return training;
    }

    public void setTraining(int training) {
        this.training = training;
    }

    private int training;
    private BattleItem battleItem = new BattleItem();

    public CareerContestant(String contestantId, int health, String gender, int attack, int defence, int training) {
        super(contestantId, health, gender, attack, defence);
        this.training = training;
        BattleItem startingBattleItem = battleItem;
    }


}
