package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.a.e;
import com.google.android.play.core.tasks.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f62485a;

    static {
        Covode.recordClassIndex(38451);
    }

    f(String str) {
        this.f62485a = str;
    }

    @Override // com.google.android.play.core.tasks.b
    public final void a(Object obj) {
        e.a().a(this.f62485a, ((Integer) obj).intValue());
    }
}
