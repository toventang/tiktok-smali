package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.snackbar.Snackbar;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.im.service.model.j;
import h.c.b.a.k;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.z;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f102451a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(65588);
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65589);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
        }

        public a(f.c cVar) {
            super(cVar);
        }
    }

    public static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Snackbar $snackbar;
        int label;

        static {
            Covode.recordClassIndex(65591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Snackbar snackbar, h.c.d dVar) {
            super(2, dVar);
            this.$snackbar = snackbar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$snackbar, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
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
                r0 = 500(0x1f4, double:2.47E-321)
                r5.label = r2
                java.lang.Object r0 = kotlinx.coroutines.ay.a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                h.r.a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.o.f159148a
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$c$1 r1 = new com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$c$1
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Snackbar $snackbar;
        int label;

        static {
            Covode.recordClassIndex(65593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Snackbar snackbar, h.c.d dVar) {
            super(2, dVar);
            this.$snackbar = snackbar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.$snackbar, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
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
                r0 = 5000(0x1388, double:2.4703E-320)
                r5.label = r2
                java.lang.Object r0 = kotlinx.coroutines.ay.a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                h.r.a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.o.f159148a
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$d$1 r1 = new com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$d$1
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f102452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f102453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Snackbar f102454c;

        static {
            Covode.recordClassIndex(65590);
        }

        public b(Context context, j jVar, Snackbar snackbar) {
            this.f102452a = context;
            this.f102453b = jVar;
            this.f102454c = snackbar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f102452a;
            j jVar = this.f102453b;
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                if (jVar.f103915c) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", jVar.f103917e);
                    bundle.putString("enter_method", "share_toast");
                    createIIMServicebyMonsterPlugin.openSessionListActivity(context, bundle);
                } else {
                    createIIMServicebyMonsterPlugin.startChat(a.b.a(context, jVar.f103913a).c(jVar.f103917e).a(6).b("toast").f103883a);
                }
            }
            this.f102454c.c();
        }
    }
}
