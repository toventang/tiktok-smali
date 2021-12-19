package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.g.a.a;
import java.util.HashMap;

public final class co {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f142785a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f142786b;

    static {
        Covode.recordClassIndex(93399);
    }

    public static boolean a() {
        boolean z;
        String str;
        if (f142786b) {
            return f142785a;
        }
        if (Build.VERSION.SDK_INT < 21 || !a.a().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        f142785a = z;
        HashMap hashMap = new HashMap();
        if (f142785a) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("webview_use_zorder", str);
        Npth.addTags(hashMap);
        f142786b = true;
        return f142785a;
    }
}
