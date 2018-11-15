package com.company;


/**
 * Created by eg913 on 11/14/18.
 */
public class school {

    public String schoolName;
    public double score;
    public double highest = 0;
    public double secondHighest = 0;
    public double thirdHighest = 0;

    public school(String n, double s)
    {
        schoolName = n;
        score = s;

    }
    public void highestScores()
    {
        if (score > highest)
        {
            thirdHighest = secondHighest;
            secondHighest = highest;
            highest = score;

        }
        else if (score >secondHighest){
            thirdHighest = secondHighest;
            secondHighest = score;

        }
        else if (score > thirdHighest){
            thirdHighest = score;

        }

    }
    public double getHighest(){
        highestScores();
        return highest;

    }
    public double getSecond(){
        highestScores();
        return secondHighest;

    }
    public double getThird(){
        highestScores();
        return thirdHighest;
    }













    //hen else didwe get a ranking system...hmmm checkout github.com/dpennebackerand look at the repos
    //get the higehst GPA. Yep. That is the one. Look there and you will find the answer.
}
