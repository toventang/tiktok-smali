package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class d extends g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f86355d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86356a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f86357b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f86358c;

    static {
        Covode.recordClassIndex(54084);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54085);
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
        HashMap<String, Object> c2 = ag.c(v.a("button_for", this.f86356a));
        Boolean bool = this.f86357b;
        String str2 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "0";
            }
            c2.put("is_clickable", str);
        }
        Boolean bool2 = this.f86358c;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "0";
            }
            c2.put("is_buy_with_coupon", str2);
        }
        return c2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, Boolean bool, Boolean bool2) {
        super("tiktokec_product_detail_page_button_click");
        l.d(str, "");
        this.f86356a = str;
        this.f86357b = bool;
        this.f86358c = bool2;
    }
}
