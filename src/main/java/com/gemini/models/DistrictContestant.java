package com.gemini.models;

public class DistrictContestant extends Contestant {

    private int drive;


    public DistrictContestant(String contestantId, int health, String gender, int attack, int defence, int drive) {
        super(contestantId, health, gender, attack, defence);
        this.drive = drive;
    }


}
