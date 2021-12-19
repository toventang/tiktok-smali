package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.a;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f75310d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75311e;

    /* renamed from: f  reason: collision with root package name */
    private final String f75312f;

    static {
        Covode.recordClassIndex(46473);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        com.ss.android.ugc.aweme.commercialize.tasks.a aVar = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a;
        Context context = this.f35145b;
        String str = this.f75311e;
        l.b(str, "");
        if (aVar.a(context, str)) {
            return new g(true);
        }
        return new g(false, "jump to google play failed");
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        com.ss.android.ugc.aweme.commercialize.tasks.a aVar = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a;
        boolean z = this.f75310d;
        String str = this.f75312f;
        l.b(str, "");
        String str2 = this.f75311e;
        l.b(str2, "");
        if (!aVar.a(z, str, str2)) {
            return true;
        }
        com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, R.string.of, 0);
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        this.f75310d = bundle.getBoolean("is_awesome_splash_ad");
        this.f75311e = bundle.getString("aweme_package_name", "");
        this.f75312f = bundle.getString("ad_type", "");
    }
}
