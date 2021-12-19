package com.ss.android.ugc.aweme.share.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.share.a.b;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f123407a;

    static {
        Covode.recordClassIndex(81041);
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void b(SharePackage sharePackage) {
        l.d(sharePackage, "");
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void c(SharePackage sharePackage) {
        l.d(sharePackage, "");
    }

    public c(Context context) {
        l.d(context, "");
        this.f123407a = context;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final boolean a(SharePackage sharePackage) {
        l.d(sharePackage, "");
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.U(d.a(sharePackage))) {
            return true;
        }
        new a(this.f123407a).a(R.string.og).a();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void a(String str, SharePackage sharePackage) {
        l.d(str, "");
        l.d(sharePackage, "");
        Aweme a2 = d.a(sharePackage);
        if (a2 != null) {
            ShareDependService.a.a().a(this.f123407a, a2, "");
        }
    }
}
