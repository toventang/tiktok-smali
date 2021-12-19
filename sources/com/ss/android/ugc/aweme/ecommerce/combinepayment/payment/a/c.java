package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a;

import com.bytedance.android.ecommerce.a.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f85234a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(53343);
    }

    static final class a extends m implements b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f85235a = new a();

        static {
            Covode.recordClassIndex(53344);
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

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        if (r0 == null) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e r7, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r8, java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> r9) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List):java.lang.String");
    }

    public static Map<String, String> b(e eVar, o oVar, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
        T t;
        T t2;
        l.d(eVar, "");
        l.d(oVar, "");
        l.d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<e> list2 = eVar.f85296i;
        if (list2 != null) {
            for (T t3 : list2) {
                if (t3.f85288a != null) {
                    String str = t3.f85288a;
                    String str2 = null;
                    if (str != null && str.hashCode() == 1981981399 && str.equals("eg_ccdc_global_billing_address")) {
                        List<e> a2 = t3.a();
                        ArrayList arrayList = new ArrayList();
                        for (T t4 : a2) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (l.a((Object) t.getElement(), (Object) t4.f85288a)) {
                                    break;
                                }
                            }
                            T t5 = t;
                            String paramValue = t5 != null ? t5.getParamValue() : null;
                            if (paramValue != null) {
                                arrayList.add(paramValue);
                            }
                        }
                        str2 = n.a(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f85235a, 30);
                    } else {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it2.next();
                            if (l.a((Object) t2.getElement(), (Object) t3.f85288a)) {
                                break;
                            }
                        }
                        T t6 = t2;
                        if (t6 != null) {
                            str2 = t6.getParamValue();
                        }
                    }
                    try {
                        d a3 = com.bytedance.android.ecommerce.a.f6869a.a(oVar.f85334a, t3.f85288a, str2);
                        l.b(a3, "");
                        if (!a3.f6948a) {
                            String str3 = t3.f85288a;
                            String a4 = a3.a();
                            if (a4 == null) {
                                a4 = "";
                            }
                            linkedHashMap.put(str3, a4);
                        }
                    } catch (Exception unused) {
                        linkedHashMap.put(t3.f85288a, "system_error");
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
