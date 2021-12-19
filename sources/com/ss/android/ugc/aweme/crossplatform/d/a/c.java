package com.ss.android.ugc.aweme.crossplatform.d.a;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public enum c {
    refresh(R.id.dk5, "refresh"),
    copylink(R.id.af9, "copylink"),
    openwithbrowser(R.id.czk, "openwithbrowser");
    
    public int id;
    public String key;

    static {
        Covode.recordClassIndex(48879);
    }

    private c(int i2, String str) {
        this.id = i2;
        this.key = str;
    }
}
