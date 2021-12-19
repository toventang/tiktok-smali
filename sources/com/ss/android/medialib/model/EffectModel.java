package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class EffectModel {
    private int end;
    private int index;
    private int start;

    static {
        Covode.recordClassIndex(36900);
    }

    public EffectModel() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getIndex() {
        return this.index;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int i2) {
        this.end = i2;
    }

    public void setIndex(int i2) {
        this.index = i2;
    }

    public void setStart(int i2) {
        this.start = i2;
    }

    public EffectModel(int i2, int i3, int i4) {
        this.index = i2;
        this.start = i3;
        this.end = i4;
    }
}
