package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.h;
import java.util.Collections;
import java.util.Set;

public abstract class g<T extends IInterface> extends c<T> implements a.f, h.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Scope> f50404a;
    public final d r;
    private final Account s;

    static {
        Covode.recordClassIndex(31401);
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account n() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final Set<Scope> r() {
        return this.f50404a;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int e() {
        return super.e();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> l() {
        if (i()) {
            return this.f50404a;
        }
        return Collections.emptySet();
    }

    public g(Context context, Looper looper, int i2, d dVar, i.b bVar, i.c cVar) {
        this(context, looper, i2, dVar, (e) bVar, (m) cVar);
    }

    public g(Context context, Looper looper, int i2, d dVar, e eVar, m mVar) {
        this(context, looper, i.a(context), GoogleApiAvailability.getInstance(), i2, dVar, (e) r.a(eVar), (m) r.a(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g(android.content.Context r14, android.os.Looper r15, com.google.android.gms.common.internal.i r16, com.google.android.gms.common.GoogleApiAvailability r17, int r18, com.google.android.gms.common.internal.d r19, com.google.android.gms.common.api.internal.e r20, com.google.android.gms.common.api.internal.m r21) {
        /*
            r13 = this;
            r3 = r13
            r11 = 0
            r0 = r20
            if (r0 != 0) goto L_0x003e
            r10 = r11
        L_0x0007:
            r0 = r21
            if (r0 != 0) goto L_0x0038
        L_0x000b:
            r1 = r19
            java.lang.String r12 = r1.f50389h
            r4 = r13
            r8 = r17
            r7 = r16
            r6 = r15
            r5 = r14
            r9 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.r = r1
            android.accounts.Account r0 = r1.f50382a
            r3.s = r0
            java.util.Set<com.google.android.gms.common.api.Scope> r2 = r1.f50384c
            java.util.Iterator r1 = r2.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0044
            goto L_0x0027
        L_0x0038:
            com.google.android.gms.common.internal.x r11 = new com.google.android.gms.common.internal.x
            r11.<init>(r0)
            goto L_0x000b
        L_0x003e:
            com.google.android.gms.common.internal.w r10 = new com.google.android.gms.common.internal.w
            r10.<init>(r0)
            goto L_0x0007
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r1.<init>(r0)
            throw r1
        L_0x004c:
            r3.f50404a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.g.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.i, com.google.android.gms.common.GoogleApiAvailability, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.m):void");
    }
}
