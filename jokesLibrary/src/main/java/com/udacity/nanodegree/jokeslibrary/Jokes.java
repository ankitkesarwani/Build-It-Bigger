package com.udacity.nanodegree.jokeslibrary;

import java.util.Random;

public class Jokes {

    private static String[] jokeList = new String[]{
            "What’s the best thing about Switzerland? I don’t know, but the flag is a big plus.",
            "I invented a new word! Plagiarism!",
            "Did you hear about the mathematician who’s afraid of negative numbers? He’ll stop at nothing to avoid them.",
            "Why do we tell actors to \"break a leg?\" Because every play has a cast.",
            "Helvetica and Times New Roman walk into a bar. \"Get out of here!\" shouts the bartender. \"We don’t serve your type.\"",
            "Hear about the new restaurant called Karma? There’s no menu: You get what you deserve.",
            "A bear walks into a bar and says, \"Give me a whiskey and … cola.\" \"Why the big pause?\" asks the bartender. The bear shrugged. \"I’m not sure; I was born with them.\"",
            "Why don’t scientists trust atoms? Because they make up everything.",
            "Why did the chicken go to the séance? To get to the other side.",
            "Where are average things manufactured? The satisfactory.",
            "How do you drown a hipster? Throw him in the mainstream.",
            "What does a nosy pepper do? Gets jalapeño business!",
            "How does Moses make tea? He brews.",
            "Why can’t you explain puns to kleptomaniacs? They always take things literally."
    };

    public static String getJoke() {
        int index = new Random().nextInt(14);
        return jokeList[index];
    }
}
