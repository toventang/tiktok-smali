package com.ss.android.ugc.aweme.im.sdk.share.ui.b;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.f;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import java.util.Set;

public final class a {

    /* renamed from: a */
    public static final a f103625a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(66389);
    }

    public static Dialog a(Activity activity, SharePackage sharePackage, f fVar, Set<? extends IMContact> set, boolean z, com.ss.android.ugc.aweme.im.service.share.a.a aVar, boolean z2, c cVar) {
        Dialog aVar2;
        l.d(activity, "");
        l.d(sharePackage, "");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.ui.d.a(activity);
        } else if (fVar != null) {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.ui.c.a(activity, set, z, aVar, z2, sharePackage, cVar, fVar);
        } else {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.ui.c.a(activity, set, z, aVar, z2, sharePackage, cVar);
        }
        return aVar2;
    }

    public static /* synthetic */ Dialog a(Activity activity, SharePackage sharePackage, Set set, boolean z, com.ss.android.ugc.aweme.im.service.share.a.a aVar, boolean z2, c cVar, int i2) {
        Set set2 = set;
        boolean z3 = z;
        com.ss.android.ugc.aweme.im.service.share.a.a aVar2 = aVar;
        boolean z4 = z2;
        c cVar2 = null;
        if ((i2 & 8) != 0) {
            set2 = null;
        }
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            aVar2 = null;
        }
        if ((i2 & 64) != 0) {
            z4 = false;
        }
        if ((i2 & 128) == 0) {
            cVar2 = cVar;
        }
        return a(activity, sharePackage, (f) null, set2, z3, aVar2, z4, cVar2);
    }
}
