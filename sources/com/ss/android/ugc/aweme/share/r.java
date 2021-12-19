package com.ss.android.ugc.aweme.share;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.hitrank.d;
import com.ss.android.ugc.aweme.im.service.c.e;
import com.ss.android.ugc.aweme.im.service.share.a.b;
import com.ss.android.ugc.aweme.im.service.share.b.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f124248a;

    static {
        Covode.recordClassIndex(81602);
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void a() {
    }

    public r(a aVar) {
        l.d(aVar, "");
        this.f124248a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void b(SharePackage sharePackage) {
        l.d(sharePackage, "");
        if (!e.b()) {
            this.f124248a.f103938a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final boolean a(SharePackage sharePackage) {
        l.d(sharePackage, "");
        String string = sharePackage.f124595i.getString("aid", "");
        if (string == null) {
            string = "";
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(AwemeService.b().d(string))) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f124248a.f103953j).a(R.string.og).a();
            return false;
        }
        l.d(sharePackage, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void c(SharePackage sharePackage) {
        l.d(sharePackage, "");
        Bundle bundle = sharePackage.f124595i;
        if (l.a((Object) bundle.getString("is_star"), (Object) "1")) {
            d.a(bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), 3, null);
        }
        com.ss.android.ugc.aweme.sharer.ui.d dVar = this.f124248a.f103944g;
        if (dVar != null) {
            dVar.a(sharePackage);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void a(String str, SharePackage sharePackage) {
        l.d(str, "");
        l.d(sharePackage, "");
        b.a.a(str, sharePackage);
    }
}
