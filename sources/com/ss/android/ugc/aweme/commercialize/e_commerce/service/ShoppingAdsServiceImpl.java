package com.ss.android.ugc.aweme.commercialize.e_commerce.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.c.a;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.GetSharedMemoryItemMethod;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.OpenHybridMethod;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.SetSharedMemoryItemMethod;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class ShoppingAdsServiceImpl implements IShoppingAdsService {
    static {
        Covode.recordClassIndex(45492);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final boolean a() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final /* synthetic */ com.ss.android.ugc.aweme.base.f.a b() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final boolean c() {
        return com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.b.a.a();
    }

    public static IShoppingAdsService d() {
        MethodCollector.i(6495);
        Object a2 = com.ss.android.ugc.b.a(IShoppingAdsService.class, false);
        if (a2 != null) {
            IShoppingAdsService iShoppingAdsService = (IShoppingAdsService) a2;
            MethodCollector.o(6495);
            return iShoppingAdsService;
        }
        if (com.ss.android.ugc.b.ao == null) {
            synchronized (IShoppingAdsService.class) {
                try {
                    if (com.ss.android.ugc.b.ao == null) {
                        com.ss.android.ugc.b.ao = new ShoppingAdsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6495);
                    throw th;
                }
            }
        }
        ShoppingAdsServiceImpl shoppingAdsServiceImpl = (ShoppingAdsServiceImpl) com.ss.android.ugc.b.ao;
        MethodCollector.o(6495);
        return shoppingAdsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return n.b(new SetSharedMemoryItemMethod(bVar), new GetSharedMemoryItemMethod(bVar), new OpenHybridMethod(bVar));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final boolean a(Context context) {
        Fragment a2;
        if (context != null && (context instanceof Activity) && (context instanceof e)) {
            e eVar = (e) context;
            if (!eVar.isFinishing() && (a2 = eVar.getSupportFragmentManager().a("BulletBottomSheetFragment")) != null && (a2 instanceof d)) {
                d dVar = (d) a2;
                if (dVar.isVisible()) {
                    dVar.dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    public final void a(i iVar, com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.a.a aVar, com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a aVar2) {
        String str = "";
        l.d(aVar2, str);
        l.d(aVar2, str);
        com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d dVar = new com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PDP_AD_INFO", aVar2);
        bundle.putFloat("PEEK_HEIGHT_RATIO", aVar.f73807a);
        bundle.putFloat("MAX_HEIGHT_RATIO", aVar.f73808b);
        String str2 = aVar.f73809c;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("SCHEMA", str);
        dVar.f73836c = aVar.f73811e;
        dVar.f73837d = aVar.f73810d;
        dVar.setArguments(bundle);
        if (iVar != null) {
            dVar.show(iVar, "BulletBottomSheetFragment");
        }
    }
}
