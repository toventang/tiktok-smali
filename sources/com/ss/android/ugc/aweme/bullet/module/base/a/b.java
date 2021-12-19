package com.ss.android.ugc.aweme.bullet.module.base.a;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public enum b {
    refresh(R.id.dk5, "refresh"),
    copylink(R.id.af9, "copylink"),
    openwithbrowser(R.id.czk, "openwithbrowser");
    
    public int id;
    public String key;

    static {
        Covode.recordClassIndex(42803);
    }

    private b(int i2, String str) {
        this.id = i2;
        this.key = str;
    }
}
