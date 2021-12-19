package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.model.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import h.f.b.l;
import h.z;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f124302a;

    static {
        Covode.recordClassIndex(81623);
    }

    public f(b bVar) {
        l.d(bVar, "");
        this.f124302a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a.a
    public final void a(Context context, String str, c cVar, h.f.a.b<? super c, z> bVar) {
        String str2 = "";
        l.d(context, str2);
        l.d(str, str2);
        l.d(cVar, str2);
        l.d(bVar, str2);
        b bVar2 = this.f124302a;
        n nVar = new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str, context), str, null, null, null, 60);
        String str3 = nVar.f124588g;
        if (str3 != null) {
            str2 = str3;
        }
        nVar.a("content_url", str2);
        nVar.a("media_type", "video/mp4");
        bVar2.a(nVar, context);
        cVar.b("video_form");
        bVar.invoke(cVar);
    }
}
