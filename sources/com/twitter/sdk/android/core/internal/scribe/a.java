package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.j;
import com.twitter.sdk.android.core.q;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class a extends t {

    /* renamed from: b  reason: collision with root package name */
    private static volatile ScheduledExecutorService f156038b;

    /* renamed from: c  reason: collision with root package name */
    private final j<? extends i<TwitterAuthToken>> f156039c;

    /* renamed from: d  reason: collision with root package name */
    private final String f156040d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f156041e;

    static {
        Covode.recordClassIndex(103668);
    }

    private i a() {
        return this.f156039c.a();
    }

    private String b() {
        return this.f156041e.getResources().getConfiguration().locale.getLanguage();
    }

    private static ScheduledExecutorService c() {
        MethodCollector.i(13073);
        if (f156038b == null) {
            synchronized (a.class) {
                try {
                    if (f156038b == null) {
                        ThreadFactory a2 = com.twitter.sdk.android.core.internal.i.a("scribe");
                        l.a a3 = l.a(o.SCHEDULED);
                        a3.f79174c = 1;
                        a3.f79178g = a2;
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) g.a(a3.a());
                        com.twitter.sdk.android.core.internal.i.a("scribe", scheduledExecutorService);
                        f156038b = scheduledExecutorService;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13073);
                    throw th;
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService2 = f156038b;
        MethodCollector.o(13073);
        return scheduledExecutorService2;
    }

    private static long a(i iVar) {
        if (iVar != null) {
            return iVar.f155914b;
        }
        return 0;
    }

    private void a(v vVar) {
        super.a(vVar, a(a()));
    }

    public final void a(e... eVarArr) {
        int i2 = 0;
        do {
            a(eVarArr[0], Collections.emptyList());
            i2++;
        } while (i2 <= 0);
    }

    private void a(e eVar, List<Object> list) {
        a(w.a(eVar, "", System.currentTimeMillis(), b(), this.f156040d, list));
    }

    public a(Context context, j<? extends i<TwitterAuthToken>> jVar, e eVar, com.twitter.sdk.android.core.internal.l lVar, u uVar) {
        this(context, q.a().f156179e, jVar, eVar, lVar, uVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(android.content.Context r10, com.twitter.sdk.android.core.TwitterAuthConfig r11, com.twitter.sdk.android.core.j<? extends com.twitter.sdk.android.core.i<com.twitter.sdk.android.core.TwitterAuthToken>> r12, com.twitter.sdk.android.core.e r13, com.twitter.sdk.android.core.internal.l r14, com.twitter.sdk.android.core.internal.scribe.u r15) {
        /*
            r9 = this;
            java.util.concurrent.ScheduledExecutorService r2 = c()
            com.twitter.sdk.android.core.internal.scribe.v$a r4 = new com.twitter.sdk.android.core.internal.scribe.v$a
            com.google.gson.g r1 = new com.google.gson.g
            r1.<init>()
            com.google.gson.d r0 = com.google.gson.d.LOWER_CASE_WITH_UNDERSCORES
            r1.f54712b = r0
            com.google.gson.f r0 = r1.b()
            r4.<init>(r0)
            r0 = r9
            r7 = r13
            r6 = r12
            r3 = r15
            r1 = r10
            r8 = r14
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f156041e = r1
            r9.f156039c = r6
            boolean r0 = r8.f155977a
            if (r0 == 0) goto L_0x0033
            com.twitter.sdk.android.core.internal.b r0 = r8.b()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.f155953a
        L_0x0030:
            r9.f156040d = r0
            return
        L_0x0033:
            r0 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.scribe.a.<init>(android.content.Context, com.twitter.sdk.android.core.TwitterAuthConfig, com.twitter.sdk.android.core.j, com.twitter.sdk.android.core.e, com.twitter.sdk.android.core.internal.l, com.twitter.sdk.android.core.internal.scribe.u):void");
    }
}
