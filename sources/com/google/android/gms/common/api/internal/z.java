package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;

public final class z implements at {

    /* renamed from: a  reason: collision with root package name */
    final aw f50285a;

    /* renamed from: b  reason: collision with root package name */
    boolean f50286b;

    static {
        Covode.recordClassIndex(31329);
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(ConnectionResult connectionResult, a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void c() {
        if (this.f50286b) {
            this.f50286b = false;
            this.f50285a.a(new ab(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final boolean b() {
        if (this.f50286b) {
            return false;
        }
        if (this.f50285a.f50080m.j()) {
            this.f50286b = true;
            for (bv bvVar : this.f50285a.f50080m.f50057f) {
                bvVar.f50120c = null;
            }
            return false;
        }
        this.f50285a.a((ConnectionResult) null);
        return true;
    }

    public z(aw awVar) {
        this.f50285a = awVar;
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        return (T) b(t);
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(int i2) {
        this.f50285a.a((ConnectionResult) null);
        this.f50285a.n.a(i2, this.f50286b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends com.google.android.gms.common.api.internal.d$a<? extends com.google.android.gms.common.api.p, A> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.api.a$f, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.common.api.internal.at
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.d.a<? extends com.google.android.gms.common.api.p, A>> T b(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.aw r0 = r3.f50285a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aq r0 = r0.f50080m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.bz r0 = r0.f50058g     // Catch:{ DeadObjectException -> 0x0045 }
            r0.a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aw r0 = r3.f50285a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.aq r0 = r0.f50080m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A extends com.google.android.gms.common.api.a$b> r1 = r4.f50220a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f50055d     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$f r2 = (com.google.android.gms.common.api.a.f) r2     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r0 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.r.a(r2, r0)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r0 = r2.g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.common.api.internal.aw r0 = r3.f50285a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r0.f50074g     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A extends com.google.android.gms.common.api.a$b> r0 = r4.f50220a     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r0 = 17
            r1.<init>(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.b(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.s     // Catch:{ DeadObjectException -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.common.internal.s r2 = (com.google.android.gms.common.internal.s) r2     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$h<T extends android.os.IInterface> r2 = r2.f50431a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.b(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            com.google.android.gms.common.api.internal.aw r1 = r3.f50285a
            com.google.android.gms.common.api.internal.ac r0 = new com.google.android.gms.common.api.internal.ac
            r0.<init>(r3, r3)
            r1.a(r0)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.z.b(com.google.android.gms.common.api.internal.d$a):com.google.android.gms.common.api.internal.d$a");
    }
}
