package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeHybridLabelModel implements Serializable {
    @c(a = "background_color")
    public String backgroundColor;
    @c(a = "image")
    public UrlModel imageUrl;
    @c(a = "ref_url")
    public String refUrl;
    @c(a = "text")
    public String text;
    @c(a = "text_color")
    public String textColor;

    static {
        Covode.recordClassIndex(59322);
    }

    public AwemeHybridLabelModel() {
    }

    public static /* synthetic */ AwemeHybridLabelModel copy$default(AwemeHybridLabelModel awemeHybridLabelModel, String str, String str2, String str3, UrlModel urlModel, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeHybridLabelModel.backgroundColor;
        }
        if ((i2 & 2) != 0) {
            str2 = awemeHybridLabelModel.text;
        }
        if ((i2 & 4) != 0) {
            str3 = awemeHybridLabelModel.textColor;
        }
        if ((i2 & 8) != 0) {
            urlModel = awemeHybridLabelModel.imageUrl;
        }
        if ((i2 & 16) != 0) {
            str4 = awemeHybridLabelModel.refUrl;
        }
        return awemeHybridLabelModel.copy(str, str2, str3, urlModel, str4);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.textColor;
    }

    public final UrlModel component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.refUrl;
    }

    public final AwemeHybridLabelModel copy(String str, String str2, String str3, UrlModel urlModel, String str4) {
        return new AwemeHybridLabelModel(str, str2, str3, urlModel, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeHybridLabelModel)) {
            return false;
        }
        AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) obj;
        return l.a(this.backgroundColor, awemeHybridLabelModel.backgroundColor) && l.a(this.text, awemeHybridLabelModel.text) && l.a(this.textColor, awemeHybridLabelModel.textColor) && l.a(this.imageUrl, awemeHybridLabelModel.imageUrl) && l.a(this.refUrl, awemeHybridLabelModel.refUrl);
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.imageUrl;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.refUrl;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AwemeHybridLabelModel(backgroundColor=" + this.backgroundColor + ", text=" + this.text + ", textColor=" + this.textColor + ", imageUrl=" + this.imageUrl + ", refUrl=" + this.refUrl + ")";
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final String getRefUrl() {
        return this.refUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setRefUrl(String str) {
        this.refUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.imageUrl = urlModel;
        this.refUrl = str4;
    }
}
