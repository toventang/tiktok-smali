package com.ss.android.ugc.aweme.ecommerce.address.edit.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f84438a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84439b;

    static {
        Covode.recordClassIndex(52677);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(v.a("button_for", this.f84439b), v.a("popup_for", this.f84438a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super("tiktokec_edit_address_popup_button_click");
        l.d(str, "");
        l.d(str2, "");
        this.f84438a = str;
        this.f84439b = str2;
    }
}
