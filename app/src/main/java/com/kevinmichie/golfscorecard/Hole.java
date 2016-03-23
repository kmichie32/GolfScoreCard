package com.kevinmichie.golfscorecard;

public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        mStrokeCount = strokeCount;
    }

    public Hole (String label, int strokeCount){
        mLabel = label;
        mStrokeCount = strokeCount;
    }
}
