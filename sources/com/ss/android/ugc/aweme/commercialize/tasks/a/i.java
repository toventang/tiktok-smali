package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.a;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.ss.android.ugc.aweme.commercialize.tasks.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class i extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f75324d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75325e;

    /* renamed from: f  reason: collision with root package name */
    private final int f75326f;

    /* renamed from: g  reason: collision with root package name */
    private final String f75327g;

    /* renamed from: h  reason: collision with root package name */
    private final AwemeRawAd f75328h;

    static {
        Covode.recordClassIndex(46481);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (this.f75324d.length() == 0) {
            return false;
        }
        return e.a(this.f75324d);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        if (com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, this.f75328h, this.f75324d, this.f75325e, this.f75327g, this.f75326f)) {
            return new g(true);
        }
        return new g(false, "handle popup web failed");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        l.b(string, "");
        this.f75324d = string;
        String string2 = bundle.getString("title", "");
        l.b(string2, "");
        this.f75325e = string2;
        this.f75326f = bundle.getInt("click_from");
        String string3 = bundle.getString("aweme_id", "");
        l.b(string3, "");
        this.f75327g = string3;
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = cVar.b();
        this.f75328h = (AwemeRawAd) (!(b2 instanceof AwemeRawAd) ? null : b2);
    }
}
