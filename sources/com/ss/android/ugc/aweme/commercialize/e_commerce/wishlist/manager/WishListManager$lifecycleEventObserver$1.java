package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.ss.android.ugc.aweme.commercialize.e_commerce.a.a;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class WishListManager$lifecycleEventObserver$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final WishListManager$lifecycleEventObserver$1 f73893a = new WishListManager$lifecycleEventObserver$1();

    static {
        Covode.recordClassIndex(45525);
    }

    WishListManager$lifecycleEventObserver$1() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        IResourceLoaderService iResourceLoaderService;
        l.d(mVar, "");
        l.d(aVar, "");
        int i2 = c.f73921a[aVar.ordinal()];
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
