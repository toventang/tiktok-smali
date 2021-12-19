package com.bytedance.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public final class d {
    static {
        Covode.recordClassIndex(3094);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1005512447:
                if (!str.equals("output")) {
                    return "";
                }
                return UGCMonitor.TYPE_POST;
            case -865586570:
                if (!str.equals("trends")) {
                    return "";
                }
                return "dongtai";
            case 3321751:
                if (!str.equals("like")) {
                    return "";
                }
                return "fav";
            default:
                return "";
        }
    }
}
