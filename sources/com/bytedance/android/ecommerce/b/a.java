package com.bytedance.android.ecommerce.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7005a = "BaseBridgeMethod";

    static {
        Covode.recordClassIndex(3355);
    }

    public abstract String a();

    @Override // com.bytedance.ies.xbridge.b
    public String b() {
        return a();
    }

    @Override // com.bytedance.ies.xbridge.b
    public void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        a();
    }
}
