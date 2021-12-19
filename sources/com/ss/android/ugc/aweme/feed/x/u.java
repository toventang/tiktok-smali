package com.ss.android.ugc.aweme.feed.x;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.UUID;

public final class u {
    static {
        Covode.recordClassIndex(60391);
    }

    public static /* synthetic */ void a(Aweme aweme, Context context, String str, String str2, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        a(aweme, context, str, str2, z, false);
    }

    public static final void a(Aweme aweme, Context context, String str, String str2, boolean z, boolean z2) {
        l.d(aweme, "");
        l.d(context, "");
        l.d(str2, "");
        if (MSAdaptionService.c().b(context)) {
            new a(context).a("Camera is only available in the single screen mod").a();
            return;
        }
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        Activity a2 = b.a(context);
        if (a2 != null) {
            ShareDependService a3 = ShareDependService.a.a();
            p[] pVarArr = new p[4];
            pVarArr[0] = v.a("group_id", aweme.getAid());
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            pVarArr[1] = v.a("author_id", authorUid);
            pVarArr[2] = v.a("enter_from", str2);
            if (str == null) {
                str = "";
            }
            pVarArr[3] = v.a("enter_method", str);
            a3.a(uuid, aweme, a2, str2, ag.a(pVarArr), z, z2);
        }
    }
}
