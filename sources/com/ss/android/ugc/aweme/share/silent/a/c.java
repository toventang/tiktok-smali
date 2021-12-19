package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.n;
import h.f.b.l;
import h.z;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f124299a;

    static {
        Covode.recordClassIndex(81620);
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f124299a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a.a
    public final void a(Context context, String str, com.ss.android.ugc.aweme.share.model.c cVar, h.f.a.b<? super com.ss.android.ugc.aweme.share.model.c, z> bVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(cVar, "");
        l.d(bVar, "");
        b a2 = com.ss.android.ugc.aweme.sharer.c.a("facebook_story", null);
        if (a2 == null || !a2.b(context)) {
            this.f124299a.a(new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str, context), str, null, null, null, 60), context);
            cVar.b("video_form");
            bVar.invoke(cVar);
            return;
        }
        n nVar = new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str, context), null, null, null, null, 62);
        String str2 = nVar.f124588g;
        if (str2 == null) {
            str2 = "";
        }
        nVar.a("content_url", str2);
        l.b("597615686992125", "");
        nVar.a("fb_app_id", "597615686992125");
        nVar.a("media_type", "video/mp4");
        a2.a((h) nVar, context);
        cVar.b("video_form");
        bVar.invoke(cVar);
    }
}
