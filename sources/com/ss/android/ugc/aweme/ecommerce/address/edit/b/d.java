package com.ss.android.ugc.aweme.ecommerce.address.edit.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.v;
import java.util.HashMap;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final long f84440a;

    static {
        Covode.recordClassIndex(52678);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(v.a("duration", Long.valueOf(this.f84440a)));
    }

    public d(long j2) {
        super("tiktokec_shipping_address_page_stay_time");
        this.f84440a = j2;
    }
}
