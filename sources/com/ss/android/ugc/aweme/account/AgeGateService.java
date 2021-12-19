package com.ss.android.ugc.aweme.account;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAgeGateService;
import com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity;
import com.ss.android.ugc.aweme.account.agegate.b;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.ss.android.ugc.aweme.account.util.u;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bg;
import com.ss.android.ugc.aweme.cj;

public class AgeGateService implements IAgeGateService, au {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f62568a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f62569b;

    /* renamed from: c  reason: collision with root package name */
    private m f62570c;

    /* renamed from: d  reason: collision with root package name */
    private bg f62571d;

    static {
        Covode.recordClassIndex(38501);
    }

    @Override // com.ss.android.ugc.aweme.IAgeGateService
    public final IAgeGateService a() {
        this.f62569b = true;
        return this;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAgeGateService
    public final void b() {
        CachedUserAgeInfo a2 = u.a();
        if (cj.d() && a2 != null) {
            u.a(a2.getBirthday(), true, false);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        m mVar = this.f62570c;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
            this.f62570c = null;
        }
        this.f62571d = null;
    }

    @Override // com.ss.android.ugc.aweme.IAgeGateService
    public final int a(String str) {
        return h.a(str);
    }

    @Override // com.ss.android.ugc.aweme.IAgeGateService
    public final void a(Activity activity) {
        if (!(f.j() instanceof AccountDeletedActivity) && !f62568a) {
            f62568a = true;
            SmartRouter.buildRoute(activity, "//account/deleted").open();
        }
    }

    public final void a(String str, boolean z) {
        bg bgVar = this.f62571d;
        if (bgVar != null) {
            bgVar.a(str, z);
            this.f62571d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.IAgeGateService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.app.Activity r17, com.ss.android.ugc.aweme.bg r18) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.AgeGateService.a(android.app.Activity, com.ss.android.ugc.aweme.bg):boolean");
    }

    @Override // com.ss.android.ugc.aweme.IAgeGateService
    public final void a(Activity activity, bg bgVar, String str, String str2, int i2, String str3, int i3) {
        b.a(activity, str, str2, i2, str3, i3);
        m mVar = this.f62570c;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
            this.f62570c = null;
            this.f62571d = null;
        }
        this.f62571d = bgVar;
        if (!this.f62569b && (activity instanceof m)) {
            m mVar2 = (m) activity;
            this.f62570c = mVar2;
            mVar2.getLifecycle().a(this);
        }
        this.f62569b = false;
    }
}
