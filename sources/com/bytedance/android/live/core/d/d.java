package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map f8965a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8966b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8967c;

    static {
        Covode.recordClassIndex(4575);
    }

    d(Map map, String str, int i2) {
        this.f8965a = map;
        this.f8966b = str;
        this.f8967c = i2;
    }

    public final void run() {
        c.a(this.f8966b, this.f8967c, c.a(this.f8965a));
    }
}
