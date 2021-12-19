package com.bytedance.common.a.b;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.a.d.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26698a;

    /* renamed from: b  reason: collision with root package name */
    public static Executor f26699b = Executors.newCachedThreadPool();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f26700c;

    static {
        Covode.recordClassIndex(15752);
    }

    public static C0573a a() {
        return new C0573a(com.bytedance.common.a.a.a());
    }

    /* renamed from: com.bytedance.common.a.b.a$a  reason: collision with other inner class name */
    public static class C0573a {

        /* renamed from: a  reason: collision with root package name */
        public String f26702a = "none";

        /* renamed from: b  reason: collision with root package name */
        public String f26703b = "0";

        /* renamed from: c  reason: collision with root package name */
        public boolean f26704c;

        /* renamed from: d  reason: collision with root package name */
        final Context f26705d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f26706e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26707f;

        /* renamed from: g  reason: collision with root package name */
        public final List<String> f26708g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private boolean f26709h;

        /* renamed from: i  reason: collision with root package name */
        private String f26710i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f26711j;

        static {
            Covode.recordClassIndex(15754);
        }

        public final d a() {
            d dVar = new d(this.f26705d);
            dVar.q = this.f26704c;
            dVar.r = this.f26709h;
            dVar.s = this.f26710i;
            dVar.t = this.f26706e;
            dVar.n = this.f26702a;
            dVar.o = this.f26703b;
            dVar.w = this.f26708g;
            dVar.u = this.f26711j;
            dVar.v = this.f26707f;
            return dVar;
        }

        C0573a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f26705d = applicationContext;
        }
    }

    public static void a(Context context, final boolean z) {
        AnonymousClass1 r1 = new b() {
            /* class com.bytedance.common.a.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15753);
            }

            @Override // com.bytedance.common.a.b.b
            public final boolean a() {
                return z;
            }
        };
        if (!f26700c) {
            if (com.bytedance.common.a.a.f26688a == null) {
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && context == null) {
                        context = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                com.bytedance.common.a.a.f26688a = context;
            }
            f26700c = true;
            boolean a2 = r1.a();
            f26698a = a2;
            c.f26732a = a2;
        }
    }
}
