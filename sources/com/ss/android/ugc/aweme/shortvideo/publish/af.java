package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import com.ss.android.ugc.aweme.property.SmartCompileModelV1;
import com.ss.android.ugc.aweme.property.dz;
import com.ss.android.ugc.aweme.shortvideo.publish.ae;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class af implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final m f129704a;

    /* renamed from: b  reason: collision with root package name */
    public static final af f129705b = new af();

    private af() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.g
    public final void a() {
        m mVar = f129704a;
        if (mVar != null) {
            mVar.b();
        }
    }

    static {
        m mVar;
        Covode.recordClassIndex(85154);
        SmartCompileModelV1 a2 = dz.a();
        if (a2 != null) {
            q.d("SmartCompileV1 , component init , model : ".concat(String.valueOf(a2)));
            mVar = new m(new ad(a2));
        } else {
            mVar = null;
        }
        f129704a = mVar;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85155);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Float) t2.getValue(), (Float) t.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.g
    public final List<ae> a(Map<String, Float> map, boolean z) {
        Object obj;
        l.d(map, "");
        if (f129704a == null) {
            return z.INSTANCE;
        }
        SmartCompileModelV1 a2 = dz.a();
        if (a2 == null) {
            return z.INSTANCE;
        }
        List<Map.Entry> a3 = n.a((Iterable) map.entrySet(), (Comparator) new a());
        ArrayList arrayList = new ArrayList(n.a((Iterable) a3, 10));
        for (Map.Entry entry : a3) {
            arrayList.add(entry.getKey());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!z || (!l.a(obj2, (Object) "skip"))) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            int hashCode = str.hashCode();
            if (hashCode != 3343) {
                if (hashCode != 3684) {
                    if (hashCode == 3532159 && str.equals("skip")) {
                        obj = new ae.b(str);
                        arrayList3.add(obj);
                    }
                } else if (str.equals("sw")) {
                    obj = new ae.c(a2.getSwCompileSetting(), str);
                    arrayList3.add(obj);
                }
            } else if (str.equals("hw")) {
                obj = new ae.a(a2.getHwCompileSetting(), str);
                arrayList3.add(obj);
            }
            com.bytedance.services.apm.api.a.a("SmartCompileV1 ErrorLabel:".concat(String.valueOf(str)));
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.size() < 2) {
            com.bytedance.services.apm.api.a.a("SmartCompileV1 ErrorResultLabelSize:" + arrayList4.size());
        }
        return arrayList4;
    }
}
