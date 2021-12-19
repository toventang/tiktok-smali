package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class AwemeLabelModel implements Serializable {
    @c(a = "label_type")
    public int labelType;
    @c(a = "label_url")
    public UrlModel urlModels;

    static {
        Covode.recordClassIndex(59323);
    }

    public AwemeLabelModel() {
    }

    public int getLabelType() {
        return this.labelType;
    }

    public UrlModel getUrlModels() {
        return this.urlModels;
    }

    public void setLabelType(int i2) {
        this.labelType = i2;
    }

    public void setUrlModels(UrlModel urlModel) {
        this.urlModels = urlModel;
    }

    public AwemeLabelModel(UrlModel urlModel, int i2) {
        this.urlModels = urlModel;
        this.labelType = i2;
    }
}
