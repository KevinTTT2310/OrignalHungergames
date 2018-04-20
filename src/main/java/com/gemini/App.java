package com.gemini;

import com.gemini.controllers.ContestantController;
import com.gemini.controllers.GamesController;
import com.gemini.models.CareerContestant;
import com.gemini.models.Contestant;
import com.gemini.views.ContestantView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ContestantController contestantController = new ContestantController();
        contestantController.printContestantDetails();

        GamesController gamesController = new GamesController();
        gamesController.battle();


    }
}
