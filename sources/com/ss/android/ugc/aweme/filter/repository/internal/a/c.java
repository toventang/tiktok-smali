package com.ss.android.ugc.aweme.filter.repository.internal.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import f.a.d.g;
import f.a.l.b;
import h.f.b.l;
import java.util.concurrent.Future;

final class c implements Comparable<Object>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final f f95575a;

    /* renamed from: b  reason: collision with root package name */
    public final int f95576b;

    /* renamed from: c  reason: collision with root package name */
    public final b<com.ss.android.ugc.aweme.filter.repository.internal.b> f95577c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f95578d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Future<?> f95579e;

    /* renamed from: f  reason: collision with root package name */
    private final g<f, d> f95580f;

    static {
        Covode.recordClassIndex(60569);
    }

    public final void run() {
        this.f95577c.onNext(new com.ss.android.ugc.aweme.filter.repository.internal.b(com.ss.android.ugc.aweme.filter.repository.internal.c.START, this.f95575a, null, null));
        try {
            this.f95577c.onNext(new com.ss.android.ugc.aweme.filter.repository.internal.b(com.ss.android.ugc.aweme.filter.repository.internal.c.SUCCESS, this.f95575a, this.f95580f.apply(this.f95575a), null));
        } catch (Exception e2) {
            this.f95577c.onNext(new com.ss.android.ugc.aweme.filter.repository.internal.b(com.ss.android.ugc.aweme.filter.repository.internal.c.FAILED, this.f95575a, null, e2));
        } catch (Throwable th) {
            this.f95577c.onComplete();
            throw th;
        }
        this.f95577c.onComplete();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l.d(obj, "");
        if (!(obj instanceof c)) {
            return 0;
        }
        boolean z = this.f95578d;
        c cVar = (c) obj;
        boolean z2 = cVar.f95578d;
        int i2 = this.f95576b;
        int i3 = cVar.f95576b;
        if (z == z2) {
            return l.a(i2, i3);
        }
        if (z) {
            return -1;
        }
        return 1;
    }

    private c(f fVar, int i2, g<f, d> gVar, b<com.ss.android.ugc.aweme.filter.repository.internal.b> bVar, boolean z) {
        l.d(fVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        this.f95575a = fVar;
        this.f95576b = i2;
        this.f95580f = gVar;
        this.f95577c = bVar;
        this.f95578d = z;
        this.f95579e = null;
    }

    public /* synthetic */ c(f fVar, int i2, g gVar, b bVar, boolean z, byte b2) {
        this(fVar, i2, gVar, bVar, z);
    }
}
