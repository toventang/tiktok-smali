package com.ss.android.ugc.aweme.im.sdk.notification;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.am;

public final class a {

    /* renamed from: k  reason: collision with root package name */
    public static final h f102820k = i.a(m.SYNCHRONIZED, b.f102833a);

    /* renamed from: l  reason: collision with root package name */
    public static final C2596a f102821l = new C2596a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    WeakReference<Activity> f102822a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f102823b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f102824c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f102825d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f102826e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f102827f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f102828g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f102829h;

    /* renamed from: i  reason: collision with root package name */
    boolean f102830i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f102831j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$a  reason: collision with other inner class name */
    public static final class C2596a {
        static {
            Covode.recordClassIndex(65926);
        }

        public static a a() {
            return (a) a.f102820k.getValue();
        }

        private C2596a() {
        }

        public /* synthetic */ C2596a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102833a = new b();

        static {
            Covode.recordClassIndex(65927);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a((byte) 0);
        }
    }

    private a() {
        this.f102830i = true;
    }

    static {
        Covode.recordClassIndex(65925);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ boolean $startCamera;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, boolean z, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$startCamera = z;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$startCamera, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
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
                com.ss.android.ugc.aweme.im.sdk.notification.a$c$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a$c$1
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
