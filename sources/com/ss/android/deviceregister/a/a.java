package com.ss.android.deviceregister.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.b.a.a.c;
import com.ss.android.ugc.aweme.bf.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f59402a = "applog_stats";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f59403b;

    /* renamed from: c  reason: collision with root package name */
    private static String f59404c;

    static {
        Covode.recordClassIndex(36686);
    }

    public static String a() {
        if (TextUtils.isEmpty(f59404c)) {
            f59404c = c.a("c25zc2RrX29wZW51ZGlk");
        }
        return f59404c;
    }

    public static SharedPreferences a(Context context) {
        return d.a(context, f59402a, 0);
    }
}
