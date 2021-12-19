package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import org.greenrobot.eventbus.j;

public class MainMixActivityContainer extends MixActivityContainer implements au, j {
    static {
        Covode.recordClassIndex(48762);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void m() {
        super.m();
        ShareH5Service.a.a().b(this.f78508d, ((com.ss.android.ugc.aweme.crossplatform.view.j) f().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a(), 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void o() {
        super.o();
        ((DownloadBusiness) this.f78508d.a(DownloadBusiness.class)).a(this.f78505a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void p() {
        super.p();
        ((DownloadBusiness) this.f78508d.a(DownloadBusiness.class)).a(this.f78505a, (com.ss.android.ugc.aweme.crossplatform.view.j) f().a(com.ss.android.ugc.aweme.crossplatform.view.j.class));
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.f, com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void q() {
        super.q();
        ShareH5Service.a.a().a(getCrossPlatformBusiness(), f().getCurrentUrl(), 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void n() {
        super.n();
        if (h()) {
            ShareH5Service.a.a().a(this.f78508d, ((com.ss.android.ugc.aweme.crossplatform.view.j) f().a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a(), 1);
        } else {
            ShareH5Service.a.a().a(this.f78508d, 1);
        }
    }

    public MainMixActivityContainer(Activity activity, a aVar) {
        super(activity, aVar);
    }
}
