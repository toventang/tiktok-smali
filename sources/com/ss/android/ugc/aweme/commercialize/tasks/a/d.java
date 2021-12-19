package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.a;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import h.f.b.l;

public final class d extends a {

    /* renamed from: d  reason: collision with root package name */
    private final int f75313d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75314e;

    /* renamed from: f  reason: collision with root package name */
    private final int f75315f;

    static {
        Covode.recordClassIndex(46475);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (TextUtils.isEmpty(this.f75314e) || this.f75313d != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        if (com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, this.f75315f)) {
            return new g(true);
        }
        return new g(false, "handle light web failed");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        this.f75313d = bundle.getInt("webview_type");
        this.f75314e = bundle.getString("light_page_web_url");
        this.f75315f = bundle.getInt("click_from");
    }
}
