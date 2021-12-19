package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.kit.a.a.f;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.c.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.bullet.b;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.bullet.utils.c;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements h.b, e {

    /* renamed from: a  reason: collision with root package name */
    private final BulletContainerView f74057a;

    /* renamed from: b  reason: collision with root package name */
    private final String f74058b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.a f74059c;

    static {
        Covode.recordClassIndex(45611);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
        com.ss.android.ugc.aweme.bullet.a aVar = this.f74059c;
        if (aVar != null) {
            aVar.a(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
        com.ss.android.ugc.aweme.bullet.a aVar = this.f74059c;
        if (aVar != null) {
            aVar.a(uri, th);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.e
    public final void a(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        BulletContainerView bulletContainerView = this.f74057a;
        bulletContainerView.a(b.a().a());
        com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
        String str2 = this.f74058b;
        if (!(str2 == null || str2.length() == 0)) {
            String str3 = this.f74058b;
            l.d(str3, "");
            b.f74177a = str3;
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class);
            if (iResourceLoaderService != null) {
                GeckoConfig a2 = f.a(g.b.f32252a.a(iResourceLoaderService), this.f74058b);
                if (true ^ l.a((Object) a2.getAccessKey(), (Object) this.f74058b)) {
                    iResourceLoaderService.registerConfig(this.f74058b, new GeckoConfig(this.f74058b, a2.getOfflineDir(), a2.getLoaderDepender(), false, false, 24, null));
                }
                iResourceLoaderService.registerCustomLoader(b.class, com.bytedance.ies.bullet.service.base.e.HIGH);
            }
        }
        List a3 = n.a("ad_commerce");
        Context context = bulletContainerView.getContext();
        l.b(context, "");
        bulletContainerView.a(c.a(str, a3, bundle, new com.ss.android.ugc.aweme.bullet.module.base.g(context)), bundle, bVar, this);
    }

    public a(BulletContainerView bulletContainerView, String str, com.ss.android.ugc.aweme.bullet.a aVar) {
        l.d(bulletContainerView, "");
        this.f74057a = bulletContainerView;
        this.f74058b = str;
        this.f74059c = aVar;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        com.ss.android.ugc.aweme.bullet.a aVar = this.f74059c;
        if (aVar != null) {
            aVar.a(view, uri, iVar);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        com.ss.android.ugc.aweme.bullet.a aVar = this.f74059c;
        if (aVar != null) {
            aVar.a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        com.ss.android.ugc.aweme.bullet.a aVar = this.f74059c;
        if (aVar != null) {
            aVar.a(list, uri, iVar, z);
        }
    }
}
