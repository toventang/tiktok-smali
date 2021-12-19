package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.compliance.business.b.a;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class ChildModeServiceImpl implements IChildModeService {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f77154a;

    static {
        Covode.recordClassIndex(47697);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final List<String> c() {
        return com.ss.android.ugc.aweme.compliance.common.b.p();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void b() {
        boolean z;
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
        Boolean bool = true;
        aVar.f77304d = bool;
        Keva keva = aVar.f77301a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        keva.storeBoolean("have_updated_and_checked", z);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77155a = new a();

        static {
            Covode.recordClassIndex(47698);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z = false;
            if (com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.compliance.api.d.a.f76638a, 0).edit().putBoolean(com.ss.android.ugc.aweme.compliance.api.d.a.f76639b, false).commit() && com.ss.android.ugc.aweme.compliance.api.d.a.b()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77158a = new c();

        static {
            Covode.recordClassIndex(47700);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z = false;
            if (com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.compliance.api.d.a.f76638a, 0).edit().putBoolean(com.ss.android.ugc.aweme.compliance.api.d.a.f76639b, true).commit() && com.ss.android.ugc.aweme.compliance.api.d.a.a()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static IChildModeService e() {
        MethodCollector.i(4787);
        Object a2 = com.ss.android.ugc.b.a(IChildModeService.class, false);
        if (a2 != null) {
            IChildModeService iChildModeService = (IChildModeService) a2;
            MethodCollector.o(4787);
            return iChildModeService;
        }
        if (com.ss.android.ugc.b.aD == null) {
            synchronized (IChildModeService.class) {
                try {
                    if (com.ss.android.ugc.b.aD == null) {
                        com.ss.android.ugc.b.aD = new ChildModeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4787);
                    throw th;
                }
            }
        }
        ChildModeServiceImpl childModeServiceImpl = (ChildModeServiceImpl) com.ss.android.ugc.b.aD;
        MethodCollector.o(4787);
        return childModeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean a() {
        Boolean valueOf;
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
        if (aVar.f77304d != null) {
            valueOf = aVar.f77304d;
        } else {
            valueOf = Boolean.valueOf(aVar.f77301a.getBoolean("have_updated_and_checked", false));
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean d() {
        if (this.f77154a == null) {
            this.f77154a = Boolean.valueOf(Keva.getRepo("compliance_setting").getBoolean("update_and_check_new_kids_mode", false));
        }
        Boolean bool = this.f77154a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChildModeServiceImpl f77156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f77157b;

        static {
            Covode.recordClassIndex(47699);
        }

        b(ChildModeServiceImpl childModeServiceImpl, Context context) {
            this.f77156a = childModeServiceImpl;
            this.f77157b = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (iVar != null) {
                Object d2 = iVar.d();
                l.b(d2, "");
                if (((Boolean) d2).booleanValue()) {
                    ChildModeServiceImpl.d(this.f77157b);
                }
            }
            return z.f158842a;
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChildModeServiceImpl f77159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f77160b;

        static {
            Covode.recordClassIndex(47701);
        }

        d(ChildModeServiceImpl childModeServiceImpl, Context context) {
            this.f77159a = childModeServiceImpl;
            this.f77160b = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (iVar != null) {
                Object d2 = iVar.d();
                l.b(d2, "");
                if (((Boolean) d2).booleanValue()) {
                    ChildModeServiceImpl.d(this.f77160b);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void a(Context context) {
        l.d(context, "");
        i.b(c.f77158a, i.f4824a).a(new d(this, context), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void b(Context context) {
        l.d(context, "");
        i.b(a.f77155a, i.f4824a).a(new b(this, context), i.f4826c, null);
    }

    public static void d(Context context) {
        l.d(context, "");
        String packageName = context.getPackageName();
        l.b(packageName, "");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, context);
            context.startActivity(launchIntentForPackage);
            Activity[] activityStack = ActivityStack.getActivityStack();
            l.b(activityStack, "");
            for (Activity activity : h.a.i.g(activityStack)) {
                l.b(activity, "");
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Runtime.getRuntime().exit(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void c(Context context) {
        Boolean valueOf;
        if (context != null) {
            com.ss.android.ugc.aweme.compliance.common.b.a aVar = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
            boolean z = false;
            if (aVar.f77303c != null) {
                valueOf = aVar.f77303c;
            } else {
                valueOf = Boolean.valueOf(aVar.f77301a.getBoolean("update_and_check_new_kids_mode", false));
            }
            if (valueOf == null || !valueOf.booleanValue()) {
                com.ss.android.ugc.aweme.compliance.common.b.a aVar2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
                Boolean bool = true;
                aVar2.f77303c = bool;
                Keva keva = aVar2.f77301a;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                keva.storeBoolean("update_and_check_new_kids_mode", z);
                if (in.d()) {
                    com.ss.android.ugc.aweme.compliance.api.a.q().a(context);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void a(boolean z, Runnable runnable) {
        i.b(new a.CallableC1749a(z, runnable), i.f4824a);
    }
}
