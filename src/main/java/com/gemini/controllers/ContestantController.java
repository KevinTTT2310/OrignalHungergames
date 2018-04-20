package com.gemini.controllers;

import com.gemini.models.CareerContestant;
import com.gemini.models.Contestant;
import com.gemini.models.DistrictContestant;
import com.gemini.views.ContestantView;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class ContestantController {

    //instantiate contestants;
    private Contestant contestant;
    private ContestantView contestantView = new ContestantView();
    private List<DistrictContestant> listOfDistrictContestants;
    private List<CareerContestant> listOfCareerContestants;


//    Contestant contestant1 = new CareerContestant("A", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant2 = new CareerContestant("B", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant3 = new CareerContestant("C", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant4 = new CareerContestant("D", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant5 = new CareerContestant("E", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant6 = new CareerContestant("F", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant7 = new DistrictContestant("G", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant8 = new DistrictContestant("H", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant9 = new DistrictContestant("I", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant10 = new DistrictContestant("J", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant11 = new DistrictContestant("K", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant12 = new DistrictContestant("L", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant14 = new DistrictContestant("M", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant15 = new DistrictContestant("N", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant16 = new DistrictContestant("O", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant17 = new DistrictContestant("Q", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant18 = new DistrictContestant("R", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant19 = new DistrictContestant("S", (int)Math.random(), "F", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant20 = new DistrictContestant("T", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant21 = new DistrictContestant("U", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant22 = new DistrictContestant("V", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant23 = new DistrictContestant("W", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());
//    Contestant contestant24 = new DistrictContestant("X", (int)Math.random(), "M", (int)Math.random(), (int)Math.random(), (int)Math.random());


    Contestant contestant1 = new Contestant("A", 100, "F", 40, 30);
    Contestant contestant2 = new Contestant("B", 100, "M", 50, 10);



    //for loop to create 24 random contestants using constestantview

   public void addContestantInList(){


   }

    public Contestant getContestant1() {
        return contestant1;
    }

    public Contestant getContestant2(){
        return contestant1;
    }

    public void printContestantDetails(){
       List<Contestant> listOfContestants = new ArrayList<>();
       listOfContestants.add(contestant1);
       listOfContestants.add(contestant2);
       for(Contestant currentContestant : listOfContestants)
       contestantView.spawnSingleContestant(currentContestant);
   }

}

