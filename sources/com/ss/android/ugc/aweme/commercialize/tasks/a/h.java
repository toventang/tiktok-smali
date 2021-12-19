package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.a;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class h extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f75322d;

    /* renamed from: e  reason: collision with root package name */
    private final AwemeRawAd f75323e;

    static {
        Covode.recordClassIndex(46480);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        if (com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f75322d, this.f35145b, this.f75323e)) {
            return new g(true);
        }
        return new g(false, "handle vast app failed");
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (this.f75323e == null || !com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f75323e)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        l.b(string, "");
        this.f75322d = string;
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = cVar.b();
        this.f75323e = (AwemeRawAd) (!(b2 instanceof AwemeRawAd) ? null : b2);
    }
}
