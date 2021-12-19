package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.android.ecommerce.e.a;
import com.bytedance.android.ecommerce.e.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.i;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f85686a = new y();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f85687b;

    private y() {
    }

    static {
        Covode.recordClassIndex(53589);
    }

    public static d a() {
        if (f85687b) {
            d dVar = com.bytedance.android.ecommerce.a.f6869a;
            l.b(dVar, "");
            return dVar;
        }
        com.bytedance.services.apm.api.a.a("Do not init EcommerceService!");
        throw new RuntimeException("Do not init EcommerceService!");
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<Integer, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f85688a = new a();

        static {
            Covode.recordClassIndex(53590);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Integer num) {
            return String.valueOf(num.intValue());
        }
    }

    public static void a(r rVar) {
        String str;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.b bVar;
        int[] iArr;
        l.d(rVar, "");
        String str2 = rVar.f85356h;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.b> list = rVar.f85352d;
        if (list == null || (bVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.b) n.g((List) list)) == null || (iArr = bVar.f85277c) == null) {
            str = null;
        } else {
            str = i.a(iArr, ",", a.f85688a);
        }
        com.bytedance.services.apm.api.a.a((Object) str);
        if (str2 == null || str2.length() == 0) {
            com.bytedance.services.apm.api.a.a("pipo host is null");
        }
        a.C0095a aVar = new a.C0095a(g.a());
        aVar.f7043b = str2;
        aVar.f7044c = new JSONObject(dg.a().b(rVar));
        aVar.n = new com.ss.android.ugc.aweme.ecommerce.combinepayment.a();
        Object obj = rVar.f85349a;
        if (obj == null) {
            obj = z.INSTANCE;
        }
        aVar.f7046e = new JSONArray(dg.a().b(obj));
        aVar.f7053l = b.f85689a;
        aVar.f7054m = SettingServiceImpl.v().h();
        aVar.f7051j = e.f85364h;
        aVar.f7052k = rVar.f85355g;
        com.bytedance.android.ecommerce.a.f6869a.a(aVar.a());
        com.bytedance.android.ecommerce.a.f6869a.e(e.f85364h);
        f85687b = true;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.bytedance.android.ecommerce.i.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85689a = new b();

        static {
            Covode.recordClassIndex(53591);
        }

        b() {
        }

        @Override // com.bytedance.android.ecommerce.i.b
        public final void a(String str, JSONObject jSONObject) {
            com.ss.android.ugc.aweme.common.r.a(str, jSONObject);
        }
    }
}
