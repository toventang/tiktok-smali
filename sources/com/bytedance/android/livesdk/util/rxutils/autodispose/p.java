package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.f;
import f.a.t;
import f.a.x;
import f.a.z;

final class p<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final x<T> f22166a;

    /* renamed from: b  reason: collision with root package name */
    private final f f22167b;

    static {
        Covode.recordClassIndex(13077);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f22166a.b(new t(this.f22167b, zVar));
    }

    p(x<T> xVar, f fVar) {
        this.f22166a = xVar;
        this.f22167b = fVar;
    }
}
