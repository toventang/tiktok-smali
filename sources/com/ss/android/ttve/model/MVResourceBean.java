package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;

public class MVResourceBean {
    public int clipIndex = -1;
    public String content;
    public int isLoop;
    public boolean isMute;
    public double musicFadeIn;
    public double musicFadeOut;
    public int rid;
    public double seqIn;
    public double seqOut;
    public int timeMode;
    public int trackIndex = -1;
    public double trimIn;
    public double trimOut;
    public String type;

    static {
        Covode.recordClassIndex(37642);
    }
}
