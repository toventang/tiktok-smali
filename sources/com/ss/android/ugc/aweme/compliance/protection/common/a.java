package com.ss.android.ugc.aweme.compliance.protection.common;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.common.api.ProtectionApi;
import com.ss.android.ugc.aweme.compliance.protection.common.b.a;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f77938a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f77939b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f77940c = i.a((h.f.a.a) d.f77953a);

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a$a  reason: collision with other inner class name */
    public static final class C1807a implements com.ss.android.ugc.aweme.base.ui.session.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f77941a;

        static {
            Covode.recordClassIndex(48313);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.session.b
        public final /* synthetic */ void a() {
            Runnable runnable = this.f77941a;
            if (runnable != null) {
                runnable.run();
            }
        }

        public C1807a(Runnable runnable) {
            this.f77941a = runnable;
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.compliance.protection.common.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77953a = new d();

        static {
            Covode.recordClassIndex(48316);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.compliance.protection.common.b.a invoke() {
            return new com.ss.android.ugc.aweme.compliance.protection.common.b.a();
        }
    }

    public static int d() {
        if (b()) {
            return 2;
        }
        return 0;
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(48312);
    }

    public static boolean f() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean h2 = h();
        j.f107229h = h2;
        return h2;
    }

    public static final class b implements com.ss.android.ugc.aweme.compliance.api.services.teenmode.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f77944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f77945b;

        static {
            Covode.recordClassIndex(48314);
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a() {
            this.f77944a.dismiss();
            if (FamilyPiaringManager.a() == IFamilyPairingService.a.CHILD) {
                SmartRouter.buildRoute(this.f77945b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else {
                SmartRouter.buildRoute(this.f77945b, "//teenage/setting").open();
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a(Exception exc) {
            l.d(exc, "");
            this.f77944a.dismiss();
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.f77945b, (Throwable) exc, (int) R.string.g4j);
        }

        public b(o oVar, Activity activity) {
            this.f77944a = oVar;
            this.f77945b = activity;
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.compliance.api.services.teenmode.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f77948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f77949b;

        static {
            Covode.recordClassIndex(48315);
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a() {
            this.f77948a.dismiss();
            IFamilyPairingService.a a2 = FamilyPiaringManager.a();
            if (a2 == IFamilyPairingService.a.CHILD) {
                SmartRouter.buildRoute(this.f77949b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else if (a2 == IFamilyPairingService.a.PARENT) {
                SmartRouter.buildRoute(this.f77949b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_parent_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else {
                SmartRouter.buildRoute(this.f77949b, FamilyPiaringManager.e()).open();
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a(Exception exc) {
            l.d(exc, "");
            this.f77948a.dismiss();
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.f77949b, (Throwable) exc, (int) R.string.g4j);
        }

        public c(o oVar, Activity activity) {
            this.f77948a = oVar;
            this.f77949b = activity;
        }
    }

    public static boolean b() {
        if (!com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a()) {
            return g();
        }
        if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77965e.a() == com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.DEFAULT) {
            if (g()) {
                com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.OPEN);
            } else {
                com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.CLOSE);
            }
        }
        if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77965e.a() == com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.OPEN) {
            return true;
        }
        return false;
    }

    public static int c() {
        IFamilyPairingService.a a2 = FamilyPiaringManager.a();
        if (a2 == IFamilyPairingService.a.CHILD || a2 == IFamilyPairingService.a.UNLINK_LOCKED) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                return FamilyPiaringManager.d();
            }
        }
        return com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.d();
    }

    public static void e() {
        com.ss.android.ugc.aweme.account.b.c().saveSharedAccount(null);
        Context j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null) {
            j2 = com.bytedance.ies.ugc.appcontext.d.a();
        }
        if (j2 instanceof com.ss.android.ugc.aweme.main.j) {
            ((Activity) j2).finish();
        }
        SmartRouter.buildRoute(j2, "//main").addFlags(268468224).open();
    }

    private static boolean g() {
        IFamilyPairingService.a a2 = FamilyPiaringManager.a();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        boolean isLogin = g2.isLogin();
        boolean b2 = FamilyPiaringManager.b();
        if (a2 == IFamilyPairingService.a.CHILD && isLogin) {
            return b2;
        }
        if (a2 != IFamilyPairingService.a.UNLINK_LOCKED || !isLogin || !b2) {
            return com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.b();
        }
        return true;
    }

    public static boolean a() {
        IFamilyPairingService.a a2 = FamilyPiaringManager.a();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        boolean isLogin = g2.isLogin();
        if (a2 == IFamilyPairingService.a.CHILD && isLogin) {
            return FamilyPiaringManager.c();
        }
        if (a2 != IFamilyPairingService.a.UNLINK_LOCKED || !isLogin || !FamilyPiaringManager.c()) {
            return com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.c();
        }
        return true;
    }

    public static void a(com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar) {
        if (!f77938a) {
            f77940c.getValue();
            f77938a = true;
            ProtectionApi.a.f77957a.getProtectionSettings().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.C1808a(aVar), new a.b(aVar));
        }
    }
}
