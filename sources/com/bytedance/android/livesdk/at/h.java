package com.bytedance.android.livesdk.at;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public enum h {
    COMMENT(UGCMonitor.EVENT_COMMENT),
    AT("AT"),
    INTERACT("interact"),
    GIFT("gift"),
    TASK_GIFT("task_gift"),
    RECHARGE("recharge"),
    TURNTABLE("turntable"),
    LUCKYBOX("lucky_box"),
    GUARD("guard"),
    START_LIVE("start_live"),
    COMMENT_GUIDE("comment_guide"),
    RECHARGE_GUIDE("recharge_guide");
    
    String func;

    public final String getFunc() {
        return this.func;
    }

    static {
        Covode.recordClassIndex(7840);
    }

    private h(String str) {
        this.func = str;
    }
}
