package com.ss.android.ugc.aweme.sticker.types.ar.text;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f135854a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f135855b;

    /* renamed from: c  reason: collision with root package name */
    private final int f135856c;

    /* renamed from: d  reason: collision with root package name */
    private final String f135857d;

    static {
        Covode.recordClassIndex(88791);
    }

    j(h hVar, Integer num, int i2, String str) {
        this.f135854a = hVar;
        this.f135855b = num;
        this.f135856c = i2;
        this.f135857d = str;
    }

    public final void run() {
        this.f135854a.a(this.f135855b, this.f135856c, this.f135857d);
    }
}
