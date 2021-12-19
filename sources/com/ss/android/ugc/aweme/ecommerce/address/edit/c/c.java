package com.ss.android.ugc.aweme.ecommerce.address.edit.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import h.f.b.l;

public abstract class c extends m {

    /* renamed from: b  reason: collision with root package name */
    public final AddressEditActivity f84446b;

    static {
        Covode.recordClassIndex(52685);
    }

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AddressEditActivity addressEditActivity) {
        super(addressEditActivity, null, 2);
        l.d(addressEditActivity, "");
        this.f84446b = addressEditActivity;
        this.f87186j = false;
    }
}
