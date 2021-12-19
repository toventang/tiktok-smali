package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class e extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86359b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86360a;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f86361c;

    static {
        Covode.recordClassIndex(54086);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54087);
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
        HashMap<String, Object> c2 = ag.c(new p("button_for", this.f86360a));
        Boolean bool = this.f86361c;
        if (bool != null) {
            bool.booleanValue();
            if (this.f86361c.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            c2.put("is_add_new_shipping", str);
        }
        return c2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, Boolean bool) {
        super("tiktokec_product_detail_page_logisticsactionsheet_click");
        l.d(str, "");
        this.f86360a = str;
        this.f86361c = bool;
    }
}
