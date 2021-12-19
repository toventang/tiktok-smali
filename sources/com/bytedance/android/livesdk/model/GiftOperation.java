package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class GiftOperation {
    @c(a = "event_name")
    public String eventName;
    @c(a = "left_image")
    public ImageModel leftImage;
    @c(a = "right_image")
    public ImageModel rightImage;
    @c(a = "scheme_url")
    public String schemeUrl;
    @c(a = "title")
    public String title;
    @c(a = "title_color")
    public String titleColor;
    @c(a = "title_size")
    public int titleSize;

    static {
        Covode.recordClassIndex(11278);
    }
}
