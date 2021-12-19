package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class BaseTrackTimeStamp implements Serializable {
    @c(a = "p")
    private int pts = -1;

    static {
        Covode.recordClassIndex(88091);
    }

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp() {
    }

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public void setPts(int i2) {
        this.pts = i2;
    }

    public BaseTrackTimeStamp(int i2) {
        this.pts = i2;
    }
}
