package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.t;
import f.a.x;

public final class h implements g<t<Throwable>, x<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final int f22192a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final long f22193b;

    /* renamed from: c  reason: collision with root package name */
    public int f22194c;

    static {
        Covode.recordClassIndex(13103);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // f.a.d.g
    public final /* synthetic */ x<?> apply(t<Throwable> tVar) {
        return tVar.a((g<? super Throwable, ? extends x<? extends R>>) new g<Throwable, x<?>>() {
            /* class com.bytedance.android.livesdk.util.rxutils.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13104);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
                if (r2.getStatusCode() <= 599) goto L_0x001a;
             */
            @Override // f.a.d.g
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ f.a.x<?> apply(java.lang.Throwable r5) {
                /*
                    r4 = this;
                    java.lang.Throwable r5 = (java.lang.Throwable) r5
                    boolean r0 = r5 instanceof com.bytedance.android.live.base.model.b.a
                    r3 = 1
                    if (r0 == 0) goto L_0x001f
                    r2 = r5
                    com.bytedance.android.live.base.model.b.a r2 = (com.bytedance.android.live.base.model.b.a) r2
                    int r1 = r2.getStatusCode()
                    r0 = 500(0x1f4, float:7.0E-43)
                    if (r1 < r0) goto L_0x001f
                    int r1 = r2.getStatusCode()
                    r0 = 599(0x257, float:8.4E-43)
                    if (r1 > r0) goto L_0x001f
                L_0x001a:
                    f.a.t r0 = f.a.t.a(r5)
                    return r0
                L_0x001f:
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.h.this
                    int r1 = r0.f22194c
                    int r1 = r1 + r3
                    r0.f22194c = r1
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.h.this
                    int r0 = r0.f22192a
                    if (r1 > r0) goto L_0x001a
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.h.this
                    long r1 = r0.f22193b
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    f.a.t r0 = f.a.t.b(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.h.AnonymousClass1.apply(java.lang.Object):java.lang.Object");
            }
        }, false);
    }

    public h(long j2) {
        this.f22193b = j2 <= 0 ? 500 : j2;
    }
}
