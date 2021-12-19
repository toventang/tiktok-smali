package com.ss.android.ugc.aweme.lego.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f107377a = new g();

    /* renamed from: b  reason: collision with root package name */
    public Map<Object, ad> f107378b = new HashMap();

    static {
        Covode.recordClassIndex(68732);
    }

    private g() {
        ae[] values = ae.values();
        for (ae aeVar : values) {
            this.f107378b.put(aeVar, ad.values()[aeVar.ordinal()]);
        }
        aa[] values2 = aa.values();
        for (aa aaVar : values2) {
            this.f107378b.put(aaVar, ad.values()[aaVar.ordinal() + 6]);
        }
        ae[] values3 = ae.values();
        for (ae aeVar2 : values3) {
            this.f107378b.put("service" + aeVar2.name(), ad.values()[aeVar2.ordinal() + 11]);
        }
    }

    public final ad a(aa aaVar) {
        return this.f107378b.get(aaVar);
    }

    public final ad a(ae aeVar) {
        return this.f107378b.get(aeVar);
    }
}
