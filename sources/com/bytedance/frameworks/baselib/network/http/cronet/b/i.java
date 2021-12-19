package com.bytedance.frameworks.baselib.network.http.cronet.b;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.f.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements b.a {

    /* renamed from: a  reason: collision with root package name */
    static final b.a f29082a = new i();

    static {
        Covode.recordClassIndex(17028);
    }

    private i() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.f.b.a
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            if (h.f29075c != null) {
                Reflect.on(h.f29075c).call("notifyStoreRegionUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6, str7, str8).get();
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
