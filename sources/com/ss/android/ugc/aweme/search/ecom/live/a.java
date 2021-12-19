package com.ss.android.ugc.aweme.search.ecom.live;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.b.h;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.b.c;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f121098a;

    /* renamed from: b  reason: collision with root package name */
    public final h f121099b;

    /* renamed from: c  reason: collision with root package name */
    public final b.AbstractC1937b f121100c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f121101d;

    /* renamed from: e  reason: collision with root package name */
    public final String f121102e;

    /* renamed from: f  reason: collision with root package name */
    public final int f121103f;

    static {
        Covode.recordClassIndex(78884);
    }

    public final void a(com.ss.android.ugc.aweme.search.ecom.a.a aVar) {
        Aweme aweme;
        r rVar;
        b bVar = this.f121098a;
        if (bVar == null || (aweme = bVar.f121104a) == null) {
            aweme = new Aweme();
        }
        h hVar = this.f121099b;
        if (hVar != null) {
            rVar = hVar.f67311b;
        } else {
            rVar = null;
        }
        com.ss.android.ugc.aweme.common.r.a("livesdk_tiktokec_product_entrance_show", c.b(aweme, aVar, rVar));
    }

    public a(b bVar, h hVar, b.AbstractC1937b bVar2, Context context, String str, int i2) {
        l.d(context, "");
        this.f121098a = bVar;
        this.f121099b = hVar;
        this.f121100c = bVar2;
        this.f121101d = context;
        this.f121102e = str;
        this.f121103f = i2;
    }
}
