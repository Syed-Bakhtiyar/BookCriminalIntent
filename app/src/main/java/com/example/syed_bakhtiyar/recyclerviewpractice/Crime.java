package com.example.syed_bakhtiyar.recyclerviewpractice;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Syed_Bakhtiyar on 4/5/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;



    public Crime() {
        this(UUID.randomUUID());
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
}
