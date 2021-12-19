package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8955a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8956b;

    static {
        Covode.recordClassIndex(4569);
    }

    j(String str, String str2) {
        this.f8955a = str;
        this.f8956b = str2;
    }

    public final void run() {
        a.a(3, this.f8955a, this.f8956b);
    }
}
