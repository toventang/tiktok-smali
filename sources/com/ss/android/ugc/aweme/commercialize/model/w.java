package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class w implements Serializable {
    @c(a = "avatar_icon")
    public UrlModel avatarIcon;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(46192);
    }
}
