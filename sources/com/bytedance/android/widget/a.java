package com.bytedance.android.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DataCenter f24311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24312b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f24313c;

    static {
        Covode.recordClassIndex(14279);
    }

    a(DataCenter dataCenter, String str, Object obj) {
        this.f24311a = dataCenter;
        this.f24312b = str;
        this.f24313c = obj;
    }

    public final void run() {
        this.f24311a.a(this.f24312b, this.f24313c);
    }
}
