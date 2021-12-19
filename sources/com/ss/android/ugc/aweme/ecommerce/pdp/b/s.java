package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class s extends g {
    static {
        Covode.recordClassIndex(54131);
    }

    public s() {
        super("tiktokec_product_detail_skuactionsheet_click");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("click_for", "buy_now"), new p("action_sheet_for", "sku"));
    }
}
