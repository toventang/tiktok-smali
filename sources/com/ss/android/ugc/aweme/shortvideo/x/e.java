package com.ss.android.ugc.aweme.shortvideo.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.x.a;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a.C3440a f132990a;

    /* renamed from: b  reason: collision with root package name */
    private final j f132991b;

    /* renamed from: c  reason: collision with root package name */
    private final String f132992c;

    /* renamed from: d  reason: collision with root package name */
    private final String f132993d;

    /* renamed from: e  reason: collision with root package name */
    private final int f132994e;

    static {
        Covode.recordClassIndex(86970);
    }

    e(a.C3440a aVar, j jVar, String str, String str2, int i2) {
        this.f132990a = aVar;
        this.f132991b = jVar;
        this.f132992c = str;
        this.f132993d = str2;
        this.f132994e = i2;
    }

    public final void run() {
        a.C3440a aVar = this.f132990a;
        this.f132991b.a(this.f132992c, this.f132993d, aVar.f132974c, this.f132994e);
    }
}
