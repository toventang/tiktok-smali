package com.ss.android.ugc.aweme.ecommerce.address.edit.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f84435a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f84436b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84437c;

    static {
        Covode.recordClassIndex(52676);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        HashMap<String, Object> c2 = ag.c(v.a("button_for", this.f84435a));
        Boolean bool = this.f84436b;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "1";
            } else {
                str = "0";
            }
            c2.put("is_default_address", str);
        }
        String str2 = this.f84437c;
        if (str2 != null) {
            c2.put("is_email_valid", str2);
        }
        return c2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, Boolean bool, String str2) {
        super("tiktokec_shipping_address_page_button_click");
        l.d(str, "");
        this.f84435a = str;
        this.f84436b = bool;
        this.f84437c = str2;
    }
}
