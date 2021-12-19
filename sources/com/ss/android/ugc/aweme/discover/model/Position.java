package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class Position implements Serializable {
    @c(a = "begin")
    public int begin;
    @c(a = "end")
    public int end;

    static {
        Covode.recordClassIndex(50918);
    }

    public Position() {
    }

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setBegin(int i2) {
        this.begin = i2;
    }

    public void setEnd(int i2) {
        this.end = i2;
    }

    public Position(int i2, int i3) {
        setBegin(i2);
        setEnd(i3);
    }
}
