package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class ae implements Serializable {
    @c(a = "feature_lable")
    public String featureLabel;
    @c(a = "feedback_rate")
    public int feedbackRate = -1;
    @c(a = "image")
    public UrlModel image;
    @c(a = "image_url")
    public String imageUrl;
    @c(a = "origin_price")
    public String originPrice;
    @c(a = "prompt_text")
    public String service;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(46150);
    }
}
