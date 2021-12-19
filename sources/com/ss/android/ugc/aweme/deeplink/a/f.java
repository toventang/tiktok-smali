package com.ss.android.ugc.aweme.deeplink.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.ug.e;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final e f79441a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f79442b;

    static {
        Covode.recordClassIndex(49334);
    }

    f(e eVar, Uri uri) {
        this.f79441a = eVar;
        this.f79442b = uri;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        e eVar = this.f79441a;
        Uri uri = this.f79442b;
        c.f79472b = System.currentTimeMillis();
        eVar.b();
        c.a("short_2_long", 2015, uri, "short2long transUrl fail");
    }
}
