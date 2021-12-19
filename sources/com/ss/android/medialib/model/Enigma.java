package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class Enigma {
    TdPoint[] points;
    String text;
    int type;

    static {
        Covode.recordClassIndex(36901);
    }

    public TdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(TdPoint[] tdPointArr) {
        this.points = tdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
