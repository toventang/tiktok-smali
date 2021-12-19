package com.ss.android.ugc.aweme.ad.dynamic;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.c.d;
import h.f.b.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class a extends com.ss.android.ugc.aweme.bullet.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ad.feed.b.a f65700a;

    static {
        Covode.recordClassIndex(40426);
    }

    public a(com.ss.android.ugc.aweme.ad.feed.b.a aVar) {
        l.d(aVar, "");
        this.f65700a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
        l.d("onLoadStart, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
        l.d("onLoadFail error:" + th + ", uri: " + uri, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        this.f65700a.f65747c = iVar;
        l.d("onLoadUriSuccess, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
    public final void a(i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        l.d("onLoadParamsSuccess, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        l.d("onLoadKitInstanceSuccess, uri: ".concat(String.valueOf(uri)), "");
    }
}
