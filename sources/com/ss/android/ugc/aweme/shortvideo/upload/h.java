package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.upload.c;
import java.util.concurrent.Callable;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1.AnonymousClass1 f132118a;

    /* renamed from: b  reason: collision with root package name */
    private final int f132119b;

    /* renamed from: c  reason: collision with root package name */
    private final int f132120c;

    /* renamed from: d  reason: collision with root package name */
    private final float f132121d;

    static {
        Covode.recordClassIndex(86536);
    }

    h(c.AnonymousClass1.AnonymousClass1 r1, int i2, int i3, float f2) {
        this.f132118a = r1;
        this.f132119b = i2;
        this.f132120c = i3;
        this.f132121d = f2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c.AnonymousClass1.AnonymousClass1 r0 = this.f132118a;
        int i2 = this.f132119b;
        int i3 = this.f132120c;
        c.this.f132072b.add("type:" + i2 + " ext:" + i3 + " f:" + this.f132121d);
        return null;
    }
}
