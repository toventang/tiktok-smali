package com.bytedance.liko.leakdetector.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f40098a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(24714);
    }

    public static void a(Context context, String str) {
        SharedPreferences a2;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (a2 = d.a(context, "LeakDetectorSp", 0)) != null && (edit = a2.edit()) != null && (putString = edit.putString("ld_memory_peak_dump_file", str)) != null) {
            putString.commit();
        }
    }

    public static void b(Context context, String str) {
        SharedPreferences a2;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (a2 = d.a(context, "LeakDetectorSp", 0)) != null && (edit = a2.edit()) != null && (putString = edit.putString("ld_oom_dump_file", str)) != null) {
            putString.commit();
        }
    }
}
