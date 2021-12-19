package com.ss.android.ugc.aweme.badge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.badge.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.services.badge.IBadgeService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.b.b;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.i;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class a implements IBadgeService {
    static {
        Covode.recordClassIndex(41790);
    }

    @Override // com.ss.android.ugc.aweme.services.badge.IBadgeService
    public final void showBadgeShareDialog(Activity activity, Aweme aweme) {
        l.d(activity, "");
        l.d(aweme, "");
        l.d(activity, "");
        l.d(aweme, "");
        AwemeSharePackage a2 = AwemeSharePackage.a.a(aweme, activity, -1, "", "");
        e.b bVar = new e.b();
        boolean c2 = ShareDependService.a.a().c();
        if (IMService.createIIMServicebyMonsterPlugin(false) != null && !c2) {
            i.a(bVar, ShareDependService.a.a().a(a2, "others_homepage"));
        }
        ah.f123352a.a(bVar, activity, false);
        bVar.a(new b());
        bVar.o = false;
        bVar.a(a2);
        bVar.a(new b.a.C1533a());
        e a3 = bVar.a();
        Video video = aweme.getVideo();
        l.b(video, "");
        try {
            new b(activity, a3, video.getCover(), (byte) 0).show();
        } catch (Exception e2) {
            q.a("BadgeShareDialog", e2);
        }
    }
}
