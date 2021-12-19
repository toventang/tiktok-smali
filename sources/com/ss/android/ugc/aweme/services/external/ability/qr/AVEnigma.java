package com.ss.android.ugc.aweme.services.external.ability.qr;

import com.bytedance.covode.number.Covode;

public class AVEnigma {
    AVTdPoint[] points;
    String text;
    int type;

    public interface CodeType {
        static {
            Covode.recordClassIndex(79679);
        }
    }

    static {
        Covode.recordClassIndex(79678);
    }

    public AVTdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(AVTdPoint[] aVTdPointArr) {
        this.points = aVTdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
