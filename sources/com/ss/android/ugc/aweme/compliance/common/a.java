package com.ss.android.ugc.aweme.compliance.common;

import android.app.Activity;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bg;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.main.k;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77272a = new a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$a  reason: collision with other inner class name */
    public static final class C1775a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f77274a;

        static {
            Covode.recordClassIndex(47785);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$a$a  reason: collision with other inner class name */
        public static final class C1776a implements bg {
            static {
                Covode.recordClassIndex(47786);
            }

            C1776a() {
            }

            @Override // com.ss.android.ugc.aweme.bg
            public final void a(String str, boolean z) {
                l.d(str, "");
                b.f77290d = true;
                a.C0732a.f33434a.a(b.a.AGE_GATE);
            }
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            com.ss.android.ugc.aweme.account.b.d().b();
            if (!com.ss.android.ugc.aweme.account.b.d().a(this.f77274a, new C1776a())) {
                a.C0732a.f33434a.a(b.a.AGE_GATE);
            }
        }

        C1775a(Activity activity) {
            this.f77274a = activity;
        }
    }

    public static final class b implements b.c {
        static {
            Covode.recordClassIndex(47787);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
        }

        b() {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            com.ss.android.ugc.aweme.compliance.api.a.n().a();
        }
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77275a;

        static {
            Covode.recordClassIndex(47788);
        }

        c(androidx.fragment.app.e eVar) {
            this.f77275a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            a.b(this.f77275a);
            return z.f158842a;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.compliance.api.services.agegate.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77276a;

        static {
            Covode.recordClassIndex(47789);
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.b
        public final void a() {
            a.a(this.f77276a);
        }

        d(androidx.fragment.app.e eVar) {
            this.f77276a = eVar;
        }
    }

    static {
        Covode.recordClassIndex(47784);
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77277a;

        static {
            Covode.recordClassIndex(47790);
        }

        e(androidx.fragment.app.e eVar) {
            this.f77277a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f77277a);
            aVar2.f33424a = b.a.PERSONALIZED_AD;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.common.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f77278a;

                static {
                    Covode.recordClassIndex(47791);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    com.ss.android.ugc.aweme.compliance.api.a.g().a(this.f77278a.f77277a);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f77278a = r1;
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                    a.C0732a.f33434a.a(b.a.PERSONALIZED_AD);
                }
            }));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77281b;

        static {
            Covode.recordClassIndex(47794);
        }

        g(androidx.fragment.app.e eVar, boolean z) {
            this.f77280a = eVar;
            this.f77281b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f77280a);
            aVar2.f33424a = b.a.PRIVATE_ACCOUNT_TIP;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.common.a.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f77282a;

                static {
                    Covode.recordClassIndex(47795);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    SmartRouter.buildRoute(this.f77282a.f77280a, "//privacyaccounttip").withParam("isFirstLaunch", this.f77282a.f77281b).open();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f77282a = r1;
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                    a.C0732a.f33434a.a(b.a.PRIVATE_ACCOUNT_TIP);
                }
            }));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77283a;

        static {
            Covode.recordClassIndex(47796);
        }

        h(androidx.fragment.app.e eVar) {
            this.f77283a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f77283a);
            aVar2.f33424a = b.a.TERMS_CONSENT;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.common.a.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f77284a;

                static {
                    Covode.recordClassIndex(47797);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    SmartRouter.buildRoute(this.f77284a.f77283a, "//compliance/terms_consent").open();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f77284a = r1;
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                    a.C0732a.f33434a.a(b.a.TERMS_CONSENT);
                }
            }));
            return null;
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f77279a;

        static {
            Covode.recordClassIndex(47792);
        }

        public f(androidx.fragment.app.e eVar) {
            this.f77279a = eVar;
        }

        public final void run() {
            a.C0732a.f33434a.a(b.a.POLICY_NOTICE);
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f77279a);
            aVar2.f33424a = b.a.POLICY_NOTICE;
            aVar2.f33428e = b.d.POLICY_NOTICE;
            aVar.a(aVar2.a(new b.c() {
                /* class com.ss.android.ugc.aweme.compliance.common.a.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(47793);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    com.ss.android.ugc.aweme.compliance.api.a.n().b();
                }
            }));
        }
    }

    private static boolean a() {
        if (!com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().b()) {
            return false;
        }
        com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().c();
        return true;
    }

    public static void a(androidx.fragment.app.e eVar) {
        if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
            i.b(new c(eVar), i.f4824a);
        } else {
            b(eVar);
        }
    }

    private static void e(androidx.fragment.app.e eVar) {
        if (!com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a() && b.l()) {
            i.b(new h(eVar), i.f4826c);
        }
    }

    private static void c(androidx.fragment.app.e eVar) {
        boolean z;
        if (!com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a()) {
            if (eVar instanceof k) {
                z = ((k) eVar).getIsFirstLaunch();
            } else {
                z = false;
            }
            if (com.ss.android.ugc.aweme.compliance.api.a.i().a()) {
                i.b(new g(eVar, z), i.f4826c);
            }
        }
    }

    private static void d(androidx.fragment.app.e eVar) {
        Boolean bool;
        if (!com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a()) {
            AdPersonalitySettings i2 = b.i();
            if (i2 != null) {
                bool = i2.getNeedPopUp();
            } else {
                bool = null;
            }
            if (l.a((Object) bool, (Object) true)) {
                i.b(new e(eVar), i.f4826c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(androidx.fragment.app.e r1) {
        /*
            boolean r0 = com.ss.android.ugc.aweme.compliance.common.b.f77290d
            if (r0 == 0) goto L_0x0010
            r0 = 0
            com.ss.android.ugc.aweme.compliance.common.b.f77290d = r0
            com.ss.android.ugc.aweme.compliance.common.a$d r0 = new com.ss.android.ugc.aweme.compliance.common.a$d
            r0.<init>(r1)
            com.ss.android.ugc.aweme.compliance.common.b.a(r0)
            return
        L_0x0010:
            if (r1 != 0) goto L_0x001f
            android.app.Activity r1 = com.bytedance.ies.ugc.appcontext.f.j()
            boolean r0 = r1 instanceof androidx.fragment.app.e
            if (r0 != 0) goto L_0x001b
            r1 = 0
        L_0x001b:
            androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
            if (r1 == 0) goto L_0x002f
        L_0x001f:
            c(r1)
            e(r1)
            d(r1)
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.ss.android.ugc.aweme.compliance.api.a.c()
            r0.a(r1)
        L_0x002f:
            boolean r0 = a()
            if (r0 == 0) goto L_0x0036
            return
        L_0x0036:
            com.ss.android.ugc.aweme.compliance.api.b.a r1 = new com.ss.android.ugc.aweme.compliance.api.b.a
            boolean r0 = com.ss.android.ugc.aweme.compliance.common.b.f77291e
            r0 = r0 ^ 1
            r1.<init>(r0)
            com.ss.android.ugc.d.a.c.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.common.a.b(androidx.fragment.app.e):void");
    }
}
