package com.ss.android.ugc.aweme.homepage.msadapt;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.msadapt.core.a;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class MSAdaptionService implements IMSAdaptionService {

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Fragment> f99200b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f99201c;

    static {
        Covode.recordClassIndex(63200);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final Aweme b() {
        return this.f99201c;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final Fragment a() {
        WeakReference<Fragment> weakReference = this.f99200b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static IMSAdaptionService c() {
        MethodCollector.i(4845);
        Object a2 = b.a(IMSAdaptionService.class, false);
        if (a2 != null) {
            IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) a2;
            MethodCollector.o(4845);
            return iMSAdaptionService;
        }
        if (b.bv == null) {
            synchronized (IMSAdaptionService.class) {
                try {
                    if (b.bv == null) {
                        b.bv = new MSAdaptionService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4845);
                    throw th;
                }
            }
        }
        MSAdaptionService mSAdaptionService = (MSAdaptionService) b.bv;
        MethodCollector.o(4845);
        return mSAdaptionService;
    }

    static final class a implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MSAdaptionService f99202a;

        static {
            Covode.recordClassIndex(63201);
        }

        a(MSAdaptionService mSAdaptionService) {
            this.f99202a = mSAdaptionService;
        }

        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        public final void a(Aweme aweme) {
            if (aweme != null) {
                this.f99202a.a(aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        this.f99201c = aweme;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean b(Context context) {
        if (context != null && a(context)) {
            return a.C2425a.d(context);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void b(e eVar) {
        l.d(eVar, "");
        if (c((Context) eVar)) {
            SmartRouter.buildRoute(eVar, "//duo").open();
            eVar.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final com.ss.android.ugc.aweme.main.l a(Activity activity) {
        com.ss.android.ugc.aweme.main.l lVar = null;
        if (activity == null) {
            return null;
        }
        if (!(activity instanceof e)) {
            activity = null;
        }
        Fragment b2 = TabChangeManager.a.a((e) activity).b();
        if (b2 instanceof com.ss.android.ugc.aweme.main.l) {
            lVar = b2;
        }
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void a(Fragment fragment) {
        if (fragment != null) {
            this.f99200b = new WeakReference<>(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void c(e eVar) {
        l.d(eVar, "");
        i lifecycle = eVar.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.RESUMED)) {
            b(eVar);
            int e2 = a.C2425a.e(eVar);
            if (!b((Context) eVar)) {
                return;
            }
            if (e2 == 3 || e2 == 1) {
                LoginUtilsServiceImpl.a().a(new Bundle());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void a(e eVar) {
        l.d(eVar, "");
        if (a((Context) eVar)) {
            AwemeChangeCallBack.a(eVar, eVar, new a(this));
            eVar.setRequestedOrientation(-1);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean c(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        boolean b2 = b(context);
        Resources resources = context.getResources();
        l.b(resources, "");
        if (resources.getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!b2 || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return a.C2425a.b(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final w a(String str, Bundle bundle) {
        l.d(str, "");
        return new ReportActivityStatusTask(str, bundle);
    }
}
