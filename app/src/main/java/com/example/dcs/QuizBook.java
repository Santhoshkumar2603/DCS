package com.example.dcs;

public class QuizBook {

    public static String[] questions = new String [] {
            "Do you have cough?",
            "Have you had fever recently?",
            "Do you have Breathing issues?",
            "Have you travelled to foreign countries recently?",
            "Have you been with someone who has been tested positive for the corona?",

    };

    public static int[] images = new int [] {
            R.drawable.cough, R.drawable.fever, R.drawable.breath, R.drawable.business,R.drawable.contacting,


    };



    public static boolean[] answers = new boolean[]{
            false, false, false, false,false,
    };
}

