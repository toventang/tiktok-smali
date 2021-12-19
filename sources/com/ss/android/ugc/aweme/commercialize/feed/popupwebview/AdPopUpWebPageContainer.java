package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.utils.bi;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.d.a.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AdPopUpWebPageContainer extends bi implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f74297b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final m f74298a;

    /* renamed from: h  reason: collision with root package name */
    private boolean f74299h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f74300i;

    /* renamed from: j  reason: collision with root package name */
    private final int f74301j = R.id.g2;

    /* renamed from: k  reason: collision with root package name */
    private final int f74302k = R.id.g1;

    static {
        Covode.recordClassIndex(45843);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45844);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdPopUpWebPageContainer a(Activity activity, com.ss.android.ugc.aweme.crossplatform.view.a aVar, e eVar, Bundle bundle, m mVar) {
            l.d(activity, "");
            l.d(aVar, "");
            l.d(eVar, "");
            l.d(bundle, "");
            l.d(mVar, "");
            com.ss.android.ugc.aweme.crossplatform.d.a.a a2 = b.C1830b.a(bundle);
            l.b(a2, "");
            return new AdPopUpWebPageContainer(activity, aVar, eVar, a2, mVar);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        j();
    }

    private final void j() {
        if (this.f74300i) {
            this.f74299h = false;
            this.f75667d.d(this.f75666c);
        }
    }

    public final void b() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b();
        }
    }

    public final void a() {
        this.f74298a.getLifecycle().b(this);
        i();
        j();
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        i();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(false);
        }
    }

    private final void i() {
        if (this.f74299h) {
            this.f74299h = false;
            this.f75667d.c(this.f75666c);
            if (this.f75666c.findViewById(this.f74301j) != null) {
                ((DownloadBusiness) this.f75670g.a(DownloadBusiness.class)).a(this.f75666c);
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.f75667d.b(this.f75666c);
        this.f75670g.a();
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f75670g.a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.f74357a = this.f74301j;
            downloadBusiness.f74358b = this.f74302k;
            downloadBusiness.a(this.f75666c, (j) f().a(j.class));
            this.f74299h = true;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f75670g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdPopUpWebPageContainer(Activity activity, com.ss.android.ugc.aweme.crossplatform.view.a aVar, e eVar, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2, m mVar) {
        super(activity, aVar, eVar, aVar2);
        l.d(activity, "");
        l.d(aVar, "");
        l.d(eVar, "");
        l.d(aVar2, "");
        l.d(mVar, "");
        this.f74298a = mVar;
        aVar.setCrossPlatformActivityContainer(this);
        mVar.getLifecycle().a(this);
        this.f74300i = true;
    }
}
