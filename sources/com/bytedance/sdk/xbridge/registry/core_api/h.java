package com.bytedance.sdk.xbridge.registry.core_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.b;
import com.bytedance.sdk.xbridge.registry.core_api.c.a;
import com.lynx.react.bridge.ReadableMap;
import h.f.b.l;

public final class h extends c<ReadableMap> {

    /* renamed from: c  reason: collision with root package name */
    public final a f44088c = new a();

    static {
        Covode.recordClassIndex(26946);
    }

    /* Return type fixed from 'com.bytedance.sdk.xbridge.registry.core.a.a' to match base method */
    @Override // com.bytedance.sdk.xbridge.registry.core_api.c
    public final /* bridge */ /* synthetic */ com.bytedance.sdk.xbridge.registry.core.a.a<ReadableMap> a() {
        return this.f44088c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b bVar, ReadableMap readableMap) {
        super(bVar, readableMap);
        l.c(bVar, "");
        l.c(readableMap, "");
    }
}
