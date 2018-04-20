package com.gemini.models;

public class Contestant {

    private String contestantId;
    private int health = 100 ;
    private String gender;
    private int attack ;
    private int defence ;
    private boolean isAlive = true;

    public Contestant(String contestantId, int health, String gender, int attack, int defence) {
        this.contestantId = contestantId;
        this.health = health;
        this.gender = gender;
        this.attack = attack;
        this.defence = defence;
    }




    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
