package com.ss.android.ugc.aweme.deeplink.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.d.c;
import f.a.d.f;

final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f79438a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.ug.e f79439b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f79440c;

    static {
        Covode.recordClassIndex(49333);
    }

    e(d dVar, com.ss.android.ugc.aweme.ug.e eVar, Uri uri) {
        this.f79438a = dVar;
        this.f79439b = eVar;
        this.f79440c = uri;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f79438a;
        com.ss.android.ugc.aweme.ug.e eVar = this.f79439b;
        Uri uri = this.f79440c;
        c.f79472b = System.currentTimeMillis();
        String str = ((com.ss.android.ugc.aweme.api.e) obj).f66450a;
        if (TextUtils.isEmpty(str)) {
            eVar.b();
            c.a("short_2_long", 2015, uri, "short2long transUrl is empty");
            return;
        }
        dVar.a(uri, str);
        boolean z = com.bytedance.ies.ugc.appcontext.f.f34637l;
        c.f79473c = z;
        eVar.a(z);
        dVar.b(uri, str);
    }
}
