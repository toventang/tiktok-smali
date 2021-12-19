package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f143956a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143957b;

    /* renamed from: c  reason: collision with root package name */
    private final long f143958c;

    static {
        Covode.recordClassIndex(94186);
    }

    x(String str, boolean z, long j2) {
        this.f143956a = str;
        this.f143957b = z;
        this.f143958c = j2;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        return a.C3820a.f143369a.a().getDashProcessUrlData(this.f143956a, this.f143957b, this.f143958c);
    }
}
