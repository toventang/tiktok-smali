package com.ss.android.ugc.aweme.sticker.types.ar.text;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f135842a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f135843b;

    /* renamed from: c  reason: collision with root package name */
    private final int f135844c;

    /* renamed from: d  reason: collision with root package name */
    private final String f135845d;

    static {
        Covode.recordClassIndex(88782);
    }

    d(b bVar, Integer num, int i2, String str) {
        this.f135842a = bVar;
        this.f135843b = num;
        this.f135844c = i2;
        this.f135845d = str;
    }

    public final void run() {
        this.f135842a.a(this.f135843b, this.f135844c, this.f135845d);
    }
}
