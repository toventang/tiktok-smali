package com.bytedance.sdk.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.a;
import com.bytedance.sdk.bridge.api.BridgeService;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f43852a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final c f43853b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final String f43854c = f43854c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f43855d = true;

    /* renamed from: e  reason: collision with root package name */
    private static BridgeService f43856e;

    private c() {
    }

    static {
        a aVar;
        Covode.recordClassIndex(26815);
        BridgeService bridgeService = (BridgeService) com.bytedance.news.common.service.manager.c.a(BridgeService.class);
        f43856e = bridgeService;
        if (bridgeService == null || (aVar = bridgeService.initBridgeConfig()) == null) {
            aVar = new a.C1065a().a((Boolean) false).a(f43854c).b(true).c(false).d(false).a();
            l.a((Object) aVar, "");
        }
        f43852a = aVar;
    }
}
