package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;
import java.io.Serializable;

public class Preload implements Serializable {
    @c(a = "comment_median_time")
    public long commentMedianTime;
    @c(a = UGCMonitor.EVENT_COMMENT)
    public int commentPreload = -1;
    @c(a = "comment_pro")
    public double commentPro;
    @c(a = "comment_thres")
    public double commentThres;
    @c(a = "model_v2")
    public int modelV2;
    @c(a = "predict_config")
    public String predictConfig;
    @c(a = "profile_median_time")
    public long profileMedianTime;
    @c(a = "profile")
    public int profilePreload = -1;
    @c(a = "profile_pro")
    public double profilePro;
    @c(a = "profile_thres")
    public double profileThres;

    static {
        Covode.recordClassIndex(59443);
    }
}
