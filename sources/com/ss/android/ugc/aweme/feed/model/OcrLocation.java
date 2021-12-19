package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class OcrLocation implements Serializable {
    @c(a = "x_max")
    public double xMax;
    @c(a = "x_min")
    public double xMin;
    @c(a = "y_max")
    public double yMax;
    @c(a = "y_min")
    public double yMin;

    static {
        Covode.recordClassIndex(59439);
    }
}
