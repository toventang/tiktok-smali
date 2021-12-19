package com.ss.android.ugc.aweme.ecommerce.address.list.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.util.o;
import h.f.b.l;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final AddressListActivity f84557a;

    static {
        Covode.recordClassIndex(52775);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void a() {
        this.f84557a.setContentView(i());
        o.a(this.f84557a.getWindow());
        this.f84557a.getWindow().setSoftInputMode(16);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AddressListActivity addressListActivity) {
        super(addressListActivity);
        l.d(addressListActivity, "");
        this.f84557a = addressListActivity;
    }
}
