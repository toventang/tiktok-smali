package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.h;
import com.ss.android.ugc.aweme.crossplatform.d.a.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.a;
import com.ss.android.ugc.aweme.crossplatform.view.j;

public class CommercializeWebViewHelper extends bi implements au {

    /* renamed from: a  reason: collision with root package name */
    private m f75503a;

    /* renamed from: b  reason: collision with root package name */
    private long f75504b;

    static {
        Covode.recordClassIndex(46586);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.f75667d.a(this.f75666c);
    }

    private h a() {
        return (h) CrossPlatformLegacyServiceImpl.f().a(this.f75670g, h.class);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f75667d.d(this.f75666c);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(true);
        }
        this.f75503a.getLifecycle().b(this);
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.f75667d.c(this.f75666c);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(false);
        }
        this.f75504b = 0;
        d dVar = new d();
        dVar.a("duration", System.currentTimeMillis() - this.f75504b);
        r.a("h5_stay_time", dVar.f66730a);
        a();
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.f75667d.b(this.f75666c);
        this.f75670g.a();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b();
        }
        this.f75504b = System.currentTimeMillis();
        if (a() != null) {
            this.f75667d.a(j.class);
        }
    }

    private CommercializeWebViewHelper(Activity activity, a aVar, e eVar, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2, m mVar) {
        super(activity, aVar, eVar, aVar2);
        aVar.setCrossPlatformActivityContainer(this);
        this.f75503a = mVar;
        mVar.getLifecycle().a(this);
    }

    public static CommercializeWebViewHelper a(a aVar, e eVar, m mVar, Activity activity, Bundle bundle) {
        return new CommercializeWebViewHelper(activity, aVar, eVar, b.C1830b.a(bundle), mVar);
    }
}
