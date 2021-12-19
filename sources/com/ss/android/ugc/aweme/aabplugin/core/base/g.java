package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.a.b;
import com.google.android.play.core.tasks.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f62486a;

    static {
        Covode.recordClassIndex(38452);
    }

    g(String str) {
        this.f62486a = str;
    }

    @Override // com.google.android.play.core.tasks.a
    public final void a(Exception exc) {
        String str = this.f62486a;
        b.b();
        b.a(exc, str);
    }
}
