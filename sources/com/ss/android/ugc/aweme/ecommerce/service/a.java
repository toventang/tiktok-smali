package com.ss.android.ugc.aweme.ecommerce.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87351a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(54833);
    }

    public static final IECommerceService a() {
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        l.b(createIECommerceServicebyMonsterPlugin, "");
        return createIECommerceServicebyMonsterPlugin;
    }
}
