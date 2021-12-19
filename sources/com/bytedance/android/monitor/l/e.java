package com.bytedance.android.monitor.l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f23541a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(13980);
    }

    public static final String a(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    return "tt" + str3 + "_webview_timing_monitor_custom_service";
                }
                break;
            case -136676079:
                if (str.equals("newcustom")) {
                    return "bd" + str3 + "_hybrid_monitor_custom_service";
                }
                break;
            case 571840923:
                if (str.equals("samplecustom")) {
                    return "bd" + str3 + "_hybrid_monitor_custom_sample_service";
                }
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    return "bd_hybrid_monitor_service_containerError_".concat(String.valueOf(str3));
                }
                break;
        }
        return "bd_hybrid_monitor_service_" + str + '_' + str2 + '_' + str3;
    }
}
