package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f92922a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(58945);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        IRuntimeBehaviorService c2 = RuntimeBehaviorServiceImpl.c();
        if (c2 != null) {
            c2.a(str, str2);
        }
    }
}
