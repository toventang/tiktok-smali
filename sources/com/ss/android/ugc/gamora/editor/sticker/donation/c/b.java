package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public abstract class b {
    private String addTime = String.valueOf(SystemClock.elapsedRealtime());

    static {
        Covode.recordClassIndex(96445);
    }

    public abstract String getDesc();

    public abstract String getDetailUrl();

    public abstract String getDonateLink();

    public abstract UrlModel getIcon();

    public abstract String getName();

    public abstract Integer getNgoId();

    public String getAddTime() {
        return this.addTime;
    }

    public void setAddTime(String str) {
        this.addTime = str;
    }
}
