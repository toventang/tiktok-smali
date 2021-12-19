package com.ss.android.ugc.aweme.ecommerce.address.list.a;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final String f84555a;

    static {
        Covode.recordClassIndex(52771);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(v.a("button_for", this.f84555a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super("tiktokec_shipping_info_page_button_click");
        l.d(str, "");
        this.f84555a = str;
    }
}
