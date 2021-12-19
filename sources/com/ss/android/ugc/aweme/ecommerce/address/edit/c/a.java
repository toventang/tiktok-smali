package com.ss.android.ugc.aweme.ecommerce.address.edit.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity;
import com.ss.android.ugc.aweme.ecommerce.util.o;
import h.f.b.l;

public final class a extends c {
    static {
        Covode.recordClassIndex(52682);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void b() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AddressEditActivity addressEditActivity) {
        super(addressEditActivity);
        l.d(addressEditActivity, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void a(Bundle bundle) {
        ((c) this).f84446b.setContentView(i());
        o.a(((c) this).f84446b.getWindow());
        ((c) this).f84446b.getWindow().setSoftInputMode(16);
    }
}
