package com.bytedance.android.live.core.a;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements f.a.d.h {

    /* renamed from: a  reason: collision with root package name */
    private final long f8911a = Long.MAX_VALUE;

    static {
        Covode.recordClassIndex(4551);
    }

    h(long j2) {
    }

    @Override // f.a.d.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        Long l2 = (Long) obj3;
        return Boolean.valueOf(System.currentTimeMillis() - l2.longValue() > this.f8911a || System.currentTimeMillis() < l2.longValue());
    }
}
