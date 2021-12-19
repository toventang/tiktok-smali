package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public static final ea f118481a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final eb f118482b = new eb();

    private eb() {
    }

    static {
        Covode.recordClassIndex(76956);
    }

    public static ea a() {
        if (!bf.a()) {
            return null;
        }
        return (ea) b.a().a(true, "smart_compile_model_v2", ea.class, f118481a);
    }

    public static boolean b() {
        ea a2 = a();
        if (a2 == null || a2.packageUrl.length() <= 0 || !(!a2.f118480a.isEmpty())) {
            return false;
        }
        return true;
    }
}
