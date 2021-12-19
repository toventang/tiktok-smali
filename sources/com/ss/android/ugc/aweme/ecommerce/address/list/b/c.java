package com.ss.android.ugc.aweme.ecommerce.address.list.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f84570a = new c();

    static {
        Covode.recordClassIndex(52790);
    }

    c() {
        super(AddressListState.class, "status", "getStatus()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((AddressListState) obj).getStatus());
    }
}
