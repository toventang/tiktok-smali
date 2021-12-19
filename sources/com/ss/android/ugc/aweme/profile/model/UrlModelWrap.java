package com.ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class UrlModelWrap implements Serializable {
    private int position;
    private UrlModel urlModel;

    static {
        Covode.recordClassIndex(75269);
    }

    public int getPosition() {
        return this.position;
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public String toJsonString() {
        return new f().b(this);
    }

    public void setPosition(int i2) {
        this.position = i2;
    }

    public void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public static UrlModelWrap fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (UrlModelWrap) new f().a(str, UrlModelWrap.class);
    }

    public UrlModelWrap(int i2, UrlModel urlModel2) {
        this.position = i2;
        this.urlModel = urlModel2;
    }
}
