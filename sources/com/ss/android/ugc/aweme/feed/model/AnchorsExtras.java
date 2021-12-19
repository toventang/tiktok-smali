package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AnchorsExtras implements Serializable {
    @c(a = "ad_label")
    private AdLabel adLabel;
    @c(a = "tips")
    private Tips tips;

    static {
        Covode.recordClassIndex(59303);
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final Tips getTips() {
        return this.tips;
    }

    public final String toString() {
        return "AnchorsExtras(tips=" + this.tips + ", adLabel=" + this.adLabel + ')';
    }

    public final void setAdLabel(AdLabel adLabel2) {
        this.adLabel = adLabel2;
    }

    public final void setTips(Tips tips2) {
        this.tips = tips2;
    }
}
