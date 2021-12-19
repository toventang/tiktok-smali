package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class r extends g {

    /* renamed from: a  reason: collision with root package name */
    public final long f86410a;

    static {
        Covode.recordClassIndex(54130);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("duration", Long.valueOf(this.f86410a)), new p("action_sheet_for", "sku"));
    }

    public r(long j2) {
        super("tiktokec_product_detail_skuactionsheet_stay_time");
        this.f86410a = j2;
    }
}
