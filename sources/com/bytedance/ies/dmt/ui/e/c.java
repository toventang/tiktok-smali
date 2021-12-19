package com.bytedance.ies.dmt.ui.e;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f33479a;

    /* renamed from: b  reason: collision with root package name */
    private String f33480b;

    /* renamed from: c  reason: collision with root package name */
    private long f33481c;

    static {
        Covode.recordClassIndex(19970);
    }

    public static c a() {
        MethodCollector.i(8927);
        if (f33479a == null) {
            synchronized (c.class) {
                try {
                    if (f33479a == null) {
                        f33479a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8927);
                    throw th;
                }
            }
        }
        c cVar = f33479a;
        MethodCollector.o(8927);
        return cVar;
    }

    public final boolean a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f33481c <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && TextUtils.equals(this.f33480b, str)) {
            return false;
        }
        this.f33480b = str;
        this.f33481c = currentTimeMillis;
        return true;
    }
}
