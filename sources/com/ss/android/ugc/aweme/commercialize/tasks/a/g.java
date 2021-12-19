package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.a;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import h.f.b.l;

public final class g extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f75318d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75319e;

    /* renamed from: f  reason: collision with root package name */
    private final String f75320f;

    /* renamed from: g  reason: collision with root package name */
    private final String f75321g;

    static {
        Covode.recordClassIndex(46479);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        com.ss.android.ugc.aweme.commercialize.tasks.a aVar = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a;
        String str = this.f75318d;
        l.b(str, "");
        return aVar.c(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final com.bytedance.ies.ugc.aweme.rich.c.a.g a() {
        com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, this.f75321g, this.f75318d, this.f75319e, this.f75320f);
        return new com.bytedance.ies.ugc.aweme.rich.c.a.g(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        this.f75318d = bundle.getString("open_url", "");
        this.f75319e = bundle.getString("log_extra", "");
        this.f75320f = bundle.getString("creative_id", "");
        this.f75321g = bundle.getString("aweme_id", "");
    }
}
