package com.ss.android.ugc.aweme.ecommerce.address.list.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import h.f.b.l;

public abstract class i extends m {

    /* renamed from: c  reason: collision with root package name */
    public final AddressListActivity f84576c;

    static {
        Covode.recordClassIndex(52796);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(AddressListActivity addressListActivity) {
        super(addressListActivity, null, 2);
        l.d(addressListActivity, "");
        this.f84576c = addressListActivity;
        this.f87186j = false;
    }
}
