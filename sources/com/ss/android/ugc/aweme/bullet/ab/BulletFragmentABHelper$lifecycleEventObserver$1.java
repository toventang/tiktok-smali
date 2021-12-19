package com.ss.android.ugc.aweme.bullet.ab;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.ss.android.ugc.aweme.bullet.a.a;
import h.f.b.l;

final class BulletFragmentABHelper$lifecycleEventObserver$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final BulletFragmentABHelper$lifecycleEventObserver$1 f68834a = new BulletFragmentABHelper$lifecycleEventObserver$1();

    static {
        Covode.recordClassIndex(42403);
    }

    BulletFragmentABHelper$lifecycleEventObserver$1() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        IResourceLoaderService iResourceLoaderService;
        l.d(mVar, "");
        l.d(aVar, "");
        int i2 = b.f68843a[aVar.ordinal()];
        if (i2 == 1) {
            IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class);
            if (iResourceLoaderService2 != null) {
                iResourceLoaderService2.registerCustomLoader(a.class, com.bytedance.ies.bullet.service.base.e.HIGH);
            }
        } else if (i2 == 2 && (iResourceLoaderService = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class)) != null) {
            iResourceLoaderService.unregisterCustomLoader(a.class, com.bytedance.ies.bullet.service.base.e.HIGH);
        }
    }
}
