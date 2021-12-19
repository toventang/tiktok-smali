package com.ss.android.ugc.aweme.xsearch.horizontallist;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "horizontal_card_name")
    private String cardName;
    @com.google.gson.a.c(a = "height")
    private Integer height;
    @com.google.gson.a.c(a = "card_data")
    private JavaOnlyMap rawData;
    @com.google.gson.a.c(a = "schema")
    private String schema;
    @com.google.gson.a.c(a = "width")
    private Integer width;

    static {
        Covode.recordClassIndex(94928);
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final JavaOnlyMap getRawData() {
        return this.rawData;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final String toString() {
        return "LynxSearchHorizontalCardData(rawData=" + this.rawData + ", schema=" + this.schema + ", width=" + this.width + ", height=" + this.height + ", cardName=" + this.cardName + ')';
    }

    public final void setCardName(String str) {
        this.cardName = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setRawData(JavaOnlyMap javaOnlyMap) {
        this.rawData = javaOnlyMap;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }
}
