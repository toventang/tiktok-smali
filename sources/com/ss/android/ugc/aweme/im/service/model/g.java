package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.text.DecimalFormat;

public final class g implements Serializable {
    public static final DecimalFormat FMT = new DecimalFormat("##0.000000");
    @c(a = "commerce_scene")
    public String commerceScene = "";
    @c(a = "ext")
    public String ext = "";
    @c(a = "object_id")
    public String objectId = "";

    static {
        Covode.recordClassIndex(66567);
    }
}
