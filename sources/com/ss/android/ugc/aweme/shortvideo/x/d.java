package com.ss.android.ugc.aweme.shortvideo.x;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import com.ss.android.vesdk.VEListener;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements VEListener.j {

    /* renamed from: a  reason: collision with root package name */
    private final a.C3440a f132985a;

    /* renamed from: b  reason: collision with root package name */
    private final j f132986b;

    /* renamed from: c  reason: collision with root package name */
    private final String f132987c;

    /* renamed from: d  reason: collision with root package name */
    private final String f132988d;

    /* renamed from: e  reason: collision with root package name */
    private final int f132989e;

    static {
        Covode.recordClassIndex(86969);
    }

    d(a.C3440a aVar, j jVar, String str, String str2, int i2) {
        this.f132985a = aVar;
        this.f132986b = jVar;
        this.f132987c = str;
        this.f132988d = str2;
        this.f132989e = i2;
    }

    @Override // com.ss.android.vesdk.VEListener.j
    public final void a(int i2) {
        new Handler(Looper.getMainLooper()).post(new e(this.f132985a, this.f132986b, this.f132987c, this.f132988d, this.f132989e));
    }
}
