package com.bytedance.android.monitorV2.b;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f23834a;

    /* renamed from: b  reason: collision with root package name */
    public static final Application f23835b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f23836c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(14108);
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        l.a((Object) instance, "");
        Application application = instance.getApplication();
        l.a((Object) application, "");
        f23835b = application;
    }

    public static final String a(String str, String str2) {
        String string;
        l.c(str, "");
        l.c(str2, "");
        Application application = f23835b;
        if (application == null) {
            return str2;
        }
        SharedPreferences a2 = d.a(application, "monitor_sp", 0);
        f23834a = a2;
        return (a2 == null || (string = a2.getString(str, str2)) == null) ? str2 : string;
    }
}
