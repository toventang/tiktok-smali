package com.ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73495a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45239);
    }

    public static final ICommerceService a() {
        ICommerceService createICommerceServicebyMonsterPlugin = CommerceService.createICommerceServicebyMonsterPlugin(false);
        if (createICommerceServicebyMonsterPlugin == null) {
            return new EmptyCommerceService();
        }
        return createICommerceServicebyMonsterPlugin;
    }
}
