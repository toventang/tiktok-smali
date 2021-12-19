package com.bytedance.android.live.annotation;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public enum ScopeValue {
    BANNER("banner"),
    BARRAGE("barrage"),
    BROADCAST("broadcast"),
    COMMENT(UGCMonitor.EVENT_COMMENT),
    DECORATION("decoration"),
    FEED("feed"),
    GIFT("gift"),
    HYBRID("hybrid"),
    LINKMIC("linkmic"),
    MESSAGE("message"),
    PUBLICSCREEN("publicscreen"),
    PULLSTREAM("pullstream"),
    RANK("rank"),
    ROOMFUNCTION("roomfunction"),
    SLOT("slot"),
    WALLET("wallet"),
    WATCHLIVE("watchlive"),
    PERFORMANCE("performance"),
    OTHER("other");
    
    private String name;

    public final String getName() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(3528);
    }

    private ScopeValue(String str) {
        this.name = str;
    }
}
