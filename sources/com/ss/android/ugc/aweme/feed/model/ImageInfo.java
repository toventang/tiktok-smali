package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class ImageInfo implements Serializable {
    @c(a = "height")
    public int height;
    @c(a = "label_large")
    public UrlModel labelLarge;
    @c(a = "label_thumb")
    public UrlModel labelThumb;
    @c(a = "width")
    public int width;

    static {
        Covode.recordClassIndex(59402);
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }
}
