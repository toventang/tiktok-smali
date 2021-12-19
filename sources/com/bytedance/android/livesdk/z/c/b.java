package com.bytedance.android.livesdk.z.c;

import com.bytedance.covode.number.Covode;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f22937a;

    static {
        Covode.recordClassIndex(13555);
    }

    b(a aVar) {
        this.f22937a = aVar;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return Long.valueOf(this.f22937a.f22932b - (((Long) obj).longValue() * 1000));
    }
}
