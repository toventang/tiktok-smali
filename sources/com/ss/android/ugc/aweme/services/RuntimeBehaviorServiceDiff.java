package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import h.f.b.l;

public final class RuntimeBehaviorServiceDiff {
    public static final RuntimeBehaviorServiceDiff INSTANCE = new RuntimeBehaviorServiceDiff();

    private RuntimeBehaviorServiceDiff() {
    }

    static {
        Covode.recordClassIndex(79560);
    }

    public final void event(String str) {
        l.d(str, "");
        RuntimeBehaviorServiceImpl.c().a(str);
    }

    public final void event(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        RuntimeBehaviorServiceImpl.c().a(str, str2);
    }
}
