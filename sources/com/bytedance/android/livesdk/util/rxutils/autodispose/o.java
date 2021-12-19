package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.f;
import f.a.h;
import org.a.b;
import org.a.c;

final class o<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f22164b;

    /* renamed from: c  reason: collision with root package name */
    private final f f22165c;

    static {
        Covode.recordClassIndex(13076);
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f22164b.a_(new v(this.f22165c, cVar));
    }

    o(b<T> bVar, f fVar) {
        this.f22164b = bVar;
        this.f22165c = fVar;
    }
}
