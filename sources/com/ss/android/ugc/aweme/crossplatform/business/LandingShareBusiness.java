package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a.s;
import com.ss.android.ugc.aweme.share.improve.a.t;
import com.ss.android.ugc.aweme.share.improve.a.u;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.d;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;

public class LandingShareBusiness extends AbsShareBusiness {
    static {
        Covode.recordClassIndex(48813);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness
    public final void b() {
        if ((this.f78618l instanceof Activity) && this.f78594a != null) {
            e.b bVar = new e.b();
            bVar.a(ShareDependService.a.a().a(this.f78594a, ""));
            ah.f123352a.a(bVar, (Activity) this.f78618l, true);
            bVar.a(this.f78594a);
            bVar.o = true;
            bVar.a(new d() {
                /* class com.ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48814);
                }

                @Override // com.ss.android.ugc.aweme.sharer.ui.d
                public final void a(SharePackage sharePackage) {
                }

                @Override // com.ss.android.ugc.aweme.sharer.ui.d
                public final void a(String str, SharePackage sharePackage) {
                }

                @Override // com.ss.android.ugc.aweme.sharer.ui.d
                public final boolean b(SharePackage sharePackage) {
                    ShareDependService.a.a().a(LandingShareBusiness.this.f78618l, LandingShareBusiness.this.f78617k.f78741a.f78737j);
                    return true;
                }
            });
            bVar.f124665d = true;
            this.f78594a.f124595i.putString("aweme_id", this.f78617k.f78741a.f78737j);
            if (this.f78617k.f78744d.f78796d) {
                bVar.a(new u());
            }
            if (this.f78595b.contains("copylink")) {
                bVar.a(new s("fromWeb"));
            }
            if (this.f78595b.contains("browser")) {
                bVar.a(new t());
            }
            bVar.f124666e = true;
            ShareDependService.a.a().a(f.j(), bVar.a(), R.style.wk).show();
        }
    }

    public LandingShareBusiness(e eVar) {
        super(eVar);
    }
}
