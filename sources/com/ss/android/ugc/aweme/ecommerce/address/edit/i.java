package com.ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.edit.b.c;
import com.ss.android.ugc.aweme.ecommerce.address.edit.b.f;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f84452a;

    /* renamed from: b  reason: collision with root package name */
    long f84453b;

    /* renamed from: c  reason: collision with root package name */
    long f84454c;

    static {
        Covode.recordClassIndex(52691);
    }

    static final class a extends m implements b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84455a = new a();

        static {
            Covode.recordClassIndex(52692);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return str2;
        }
    }

    public i(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        String str;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f84452a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        if (addressEditEnterParams != null) {
            if (addressEditEnterParams.f84246b == null) {
                str = "add";
            } else {
                str = "edit";
            }
            linkedHashMap.put("shipping_address_enter_type", str);
            linkedHashMap.put("previous_page", addressEditEnterParams.f84247c);
            if (addressEditEnterParams.f84248d != null) {
                try {
                    obj = j.a().a(addressEditEnterParams.f84248d, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                if (hashMap != null) {
                    linkedHashMap.putAll(hashMap);
                }
            }
        }
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        new c(str, str2).c(this.f84452a);
    }

    public final void a(boolean z, List<String> list) {
        l.d(list, "");
        new f(z, n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f84455a, 30)).c(this.f84452a);
    }

    public final void a(String str, Boolean bool, String str2) {
        l.d(str, "");
        new com.ss.android.ugc.aweme.ecommerce.address.edit.b.b(str, bool, str2).c(this.f84452a);
    }
}
