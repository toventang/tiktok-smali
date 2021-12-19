package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class o extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86404c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86405a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f86406b;

    static {
        Covode.recordClassIndex(54124);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54125);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        HashMap<String, Object> c2 = ag.c(new p("action_sheet_for", this.f86405a));
        Boolean bool = this.f86406b;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            c2.put("has_shipping_address", str);
        }
        return c2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, Boolean bool) {
        super("tiktokec_product_detail_page_action_sheet_show");
        l.d(str, "");
        this.f86405a = str;
        this.f86406b = bool;
    }
}
