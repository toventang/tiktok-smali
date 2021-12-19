package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class GroupSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(65754);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final h a(b bVar) {
        l.d(bVar, "");
        String a2 = c.a(this.f124594h, this.f124590d, bVar);
        if (l.a((Object) bVar.a(), (Object) "twitter")) {
            a2 = d.a().getString(R.string.c9y, a2);
            l.b(a2, "");
        }
        String a3 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        String a4 = bVar.a();
        if (a4.hashCode() == 96619420 && a4.equals("email")) {
            return new k(a2, this.f124592f, a3);
        }
        return new k(a2, a3, null, 4);
    }
}
