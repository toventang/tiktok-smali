package com.ss.android.ugc.aweme.bullet.module.ad;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.j;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.b;
import h.f.b.l;
import h.z;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final b f69370a;

    static {
        Covode.recordClassIndex(42771);
    }

    @Override // com.bytedance.ies.bullet.c.c.j
    public final void a(i iVar) {
        l.d(iVar, "");
        j.a.a(iVar);
    }

    public g(com.bytedance.ies.bullet.c.e.a.b bVar, b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f69370a = bVar2;
    }

    @Override // com.bytedance.ies.bullet.c.c.j
    public final void a(i iVar, Uri uri) {
        l.d(iVar, "");
        l.d(uri, "");
        j.a.a(iVar, uri);
    }

    @Override // com.bytedance.ies.bullet.c.c.j
    public final void a(i iVar, Throwable th) {
        AdLynxStatBusiness adLynxStatBusiness;
        l.d(iVar, "");
        if (th != null && (adLynxStatBusiness = (AdLynxStatBusiness) this.f69370a.a(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.b(th.getMessage());
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.j
    public final void a(i iVar, Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        j.a.a(iVar, uri, bVar, bVar2);
    }
}
