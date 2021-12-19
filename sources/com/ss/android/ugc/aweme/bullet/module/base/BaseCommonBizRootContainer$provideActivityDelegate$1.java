package com.ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.utils.permission.a;
import h.f.b.l;
import h.m.p;
import org.greenrobot.eventbus.EventBus;

public final class BaseCommonBizRootContainer$provideActivityDelegate$1 extends CommonBizActivityDelegate implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f69386a;

    static {
        Covode.recordClassIndex(42779);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    BaseCommonBizRootContainer$provideActivityDelegate$1(a aVar) {
        this.f69386a = aVar;
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void e(Activity activity) {
        l.d(activity, "");
        this.f69386a.b("onStart");
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void f(Activity activity) {
        l.d(activity, "");
        this.f69386a.b("onStop");
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void b(Activity activity) {
        l.d(activity, "");
        this.f69386a.b("onResume");
        SSWebView sSWebView = this.f69386a.f69402i;
        if (sSWebView != null) {
            sSWebView.onResume();
            sSWebView.resumeTimers();
        }
        this.f69386a.z.a(WalletBusiness.class);
        this.f69386a.u = System.currentTimeMillis();
        this.f69386a.c(activity);
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void d(Activity activity) {
        l.d(activity, "");
        EventBus.a().b(this.f69386a);
        l.b(b.a.f65586a, "");
        c a2 = b.a();
        if (a2 != null) {
            a2.a(this.f69386a.f69402i);
        }
        this.f69386a.a(activity);
        this.f69386a.b("onDestroy");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r6.pauseTimers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (r8.f69386a.h() != false) goto L_0x0047;
     */
    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.app.Activity r9) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1.c(android.app.Activity):void");
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void a(Activity activity, Bundle bundle) {
        l.d(activity, "");
        this.f69386a.z.a(activity);
        EventBus.a(EventBus.a(), this.f69386a);
        l.d(activity, "");
        this.f69386a.b("onCreate");
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void a(Activity activity, Configuration configuration) {
        OpenURLHintLayout openURLHintLayout;
        l.d(activity, "");
        if (configuration != null && (openURLHintLayout = this.f69386a.f69401h) != null) {
            openURLHintLayout.setLayoutParams(new FrameLayout.LayoutParams((int) n.b(activity, (float) configuration.screenWidthDp), (int) n.b(activity, (float) configuration.screenHeightDp)));
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void a(Activity activity, int i2, String[] strArr, int[] iArr) {
        l.d(activity, "");
        l.d(strArr, "");
        l.d(iArr, "");
        a.a(activity, i2, iArr);
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
    public final void a(Activity activity, int i2, int i3, Intent intent) {
        String str;
        l.d(activity, "");
        if (this.f69386a.z.a(WalletBusiness.class) != null && (str = this.f69386a.n) != null && p.a((CharSequence) str, (CharSequence) "wallet/home", false)) {
            l.b(b.a.f65586a, "");
            c a2 = b.a();
            if (a2 != null) {
                a2.a(i2, i3, intent);
            }
        }
    }
}
