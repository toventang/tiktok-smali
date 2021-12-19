package com.bytedance.android.ecommerce.j;

import com.bytedance.android.ecommerce.f.c;
import com.bytedance.android.ecommerce.f.d;
import com.bytedance.android.ecommerce.f.e;
import com.bytedance.android.ecommerce.f.f;
import com.bytedance.android.ecommerce.f.g;
import com.bytedance.android.ecommerce.f.h;
import com.bytedance.android.ecommerce.f.i;
import com.bytedance.android.ecommerce.f.j;
import com.bytedance.android.ecommerce.f.k;
import com.bytedance.android.ecommerce.f.l;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f7098a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.ecommerce.f.a f7099b = new com.bytedance.android.ecommerce.f.a();

    static {
        Covode.recordClassIndex(3405);
    }

    public b() {
        this.f7098a.put("eg_ccdc_global_card_number", new c());
        this.f7098a.put("eg_ccdc_global_cvv", new e());
        this.f7098a.put("eg_ccdc_global_expiration_year", new g());
        this.f7098a.put("eg_ccdc_global_billing_address_country_regin", new com.bytedance.android.ecommerce.f.b());
        this.f7098a.put("eg_ccdc_global_identity", new d());
        this.f7098a.put("eg_pi_ew_ovo_c_d_local_id_wallet_id", new i());
        this.f7098a.put("eg_ccdc_global_holder_name", new h());
        this.f7098a.put("eg_ccdc_global_email", new f());
        this.f7098a.put("eg_ccdc_global_billing_address", new k());
        this.f7098a.put("eg_ccdc_global_billing_address_street_mobile", new l());
        this.f7098a.put("eg_ccdc_global_billing_address_postal_code", new j());
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final com.bytedance.android.ecommerce.a.d a(com.bytedance.android.ecommerce.a.c... cVarArr) {
        a aVar = this.f7098a.get(cVarArr[0].f6935a);
        com.bytedance.android.ecommerce.a.d dVar = new com.bytedance.android.ecommerce.a.d();
        if (aVar != null) {
            return aVar.a(cVarArr);
        }
        return dVar;
    }
}
