package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import com.ss.android.ugc.aweme.property.ea;
import com.ss.android.ugc.aweme.property.eb;
import com.ss.android.ugc.aweme.property.fd;
import com.ss.android.ugc.aweme.property.fe;
import com.ss.android.ugc.aweme.shortvideo.publish.ae;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ag implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final m f129706a;

    /* renamed from: b  reason: collision with root package name */
    public static final ag f129707b = new ag();

    private ag() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.g
    public final void a() {
        m mVar = f129706a;
        if (mVar != null) {
            mVar.b();
        }
    }

    static {
        m mVar;
        Covode.recordClassIndex(85156);
        ea a2 = eb.a();
        if (a2 != null) {
            q.d("SmartCompileV2 , component init , model : ".concat(String.valueOf(a2)));
            mVar = new m(new ad(a2));
        } else {
            mVar = null;
        }
        f129706a = mVar;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85157);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Float) t2.getValue(), (Float) t.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.g
    public final List<ae> a(Map<String, Float> map, boolean z) {
        ae aVar;
        l.d(map, "");
        if (f129706a == null) {
            return z.INSTANCE;
        }
        List<Map.Entry> a2 = n.a((Iterable) map.entrySet(), (Comparator) new a());
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        for (Map.Entry entry : a2) {
            arrayList.add(entry.getKey());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!z || (!l.a(obj, (Object) "skip"))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            if (l.a((Object) str, (Object) "skip")) {
                aVar = new ae.b(str);
            } else {
                int a3 = p.a((CharSequence) str, "_");
                if (a3 <= 0 || a3 >= str.length() - 1) {
                    com.bytedance.services.apm.api.a.a("SmartCompileV2 ErrorLabel:".concat(String.valueOf(str)));
                } else {
                    fe[] a4 = fd.a();
                    if (a4 != null) {
                        int length = a4.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            fe feVar = a4[i2];
                            if (l.a((Object) feVar.f118540a, (Object) str)) {
                                String str2 = feVar.f118541b;
                                if (str2 != null) {
                                    int length2 = str.length();
                                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring = str.substring(a3 + 1, length2);
                                    l.b(substring, "");
                                    int hashCode = substring.hashCode();
                                    if (hashCode != 3343) {
                                        if (hashCode == 3684 && substring.equals("sw")) {
                                            aVar = new ae.c(str2, str);
                                        }
                                    } else if (substring.equals("hw")) {
                                        aVar = new ae.a(str2, str);
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    com.bytedance.services.apm.api.a.a("SmartCompileV2 ErrorLabel:".concat(String.valueOf(str)));
                }
            }
            arrayList3.add(aVar);
        }
        return arrayList3;
    }
}
