package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63023a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final o f63024b = new o();

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f63025c;

    private o() {
    }

    static {
        Covode.recordClassIndex(38819);
    }

    public static final boolean a() {
        Boolean bool = f63025c;
        if (bool != null) {
            return bool.booleanValue();
        }
        f63024b.b();
        Boolean bool2 = f63025c;
        if (bool2 == null) {
            l.b();
        }
        return bool2.booleanValue();
    }

    private synchronized void b() {
        Boolean bool;
        MethodCollector.i(9398);
        if (f63025c != null) {
            MethodCollector.o(9398);
            return;
        }
        try {
            bool = Boolean.valueOf(SettingsManager.a().a("enable_6_digit_sms_verification", false));
        } catch (Throwable unused) {
            bool = Boolean.valueOf(f63023a);
        }
        f63025c = bool;
        MethodCollector.o(9398);
    }
}
