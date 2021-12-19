package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.track.a;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f86418a;

    /* renamed from: b  reason: collision with root package name */
    public final long f86419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f86420c;

    static {
        Covode.recordClassIndex(54137);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        p[] pVarArr = new p[3];
        if (this.f86418a) {
            str = "full";
        } else {
            str = "half";
        }
        pVarArr[0] = new p("style", str);
        pVarArr[1] = new p("start_click_to_now", Long.valueOf(this.f86419b));
        pVarArr[2] = new p("product_quantity", Integer.valueOf(this.f86420c));
        return ag.c(pVarArr);
    }

    public w(boolean z, long j2, int i2) {
        super("rd_tiktokec_anchor_sku_duration");
        this.f86418a = z;
        this.f86419b = j2;
        this.f86420c = i2;
    }
}
