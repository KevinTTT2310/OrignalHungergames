package com.gemini.controllers;

import com.gemini.models.Contestant;

public class GamesController {

    private ContestantController contestantController = new ContestantController();

    public GamesController() {

    }


    // Need to be able to get the contestants from the contestController and load them in a game;
    public void loadContestants() {
//        Contestant contestant1 = contestantController.getContestant1();
//        Contestant contestent2 = contestantController.getContestant2();

    }

    public void battle() {
        if (contestantController.contestant1.getAttack() > contestantController.contestant2.getDefence()) {
            System.out.println(contestantController.contestant1.getContestantId() + " WINS");
        } else {
            System.out.println(contestantController.contestant2.getContestantId() + " WINS");
        }


    }
}

