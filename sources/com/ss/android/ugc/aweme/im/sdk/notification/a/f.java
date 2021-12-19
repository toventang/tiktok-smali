package com.ss.android.ugc.aweme.im.sdk.notification.a;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.notification.b.b;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.l;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f102856a;

    /* renamed from: b  reason: collision with root package name */
    private b f102857b;

    static {
        Covode.recordClassIndex(65945);
    }

    public final void a() {
        b bVar = this.f102857b;
        if (bVar != null && bVar.f102906a) {
            bVar.a((h.f.a.a<z>) null);
        }
        this.f102857b = null;
    }

    private static boolean b() {
        Aweme a2;
        Activity a3 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
        if (a3 == null || !(a3 instanceof j) || !(((j) a3).getCurFragment() instanceof l) || (a2 = AwemeChangeCallBack.a((e) a3)) == null || !a2.isAd()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ long $delayTime;
        int label;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(65946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, long j2, d dVar) {
            super(2, dVar);
            this.this$0 = fVar;
            this.$delayTime = j2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new a(this.this$0, this.$delayTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                h.r.a(r6)
            L_0x000f:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0012:
                h.r.a(r6)
                long r0 = r5.$delayTime
                r5.label = r2
                java.lang.Object r0 = kotlinx.coroutines.ay.a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                h.r.a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.o.f159148a
                com.ss.android.ugc.aweme.im.sdk.notification.a.f$a$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a.f$a$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.label = r3
                java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.a.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(long j2) {
        while (!c.c() && e.f102841b.f()) {
            if (j2 > 0) {
                bz unused = i.a(an.a(bf.f159040a), null, null, new a(this, j2, null), 3);
                return;
            } else if (!this.f102856a) {
                if (!b()) {
                    k d2 = c.d();
                    if (d2 != null) {
                        if (this.f102857b == null) {
                            this.f102857b = new b();
                        }
                        b bVar = this.f102857b;
                        if (bVar != null) {
                            bVar.a(d2);
                        }
                        this.f102856a = true;
                    } else {
                        return;
                    }
                }
                j2 = 1000;
            } else {
                return;
            }
        }
        this.f102856a = false;
    }
}
