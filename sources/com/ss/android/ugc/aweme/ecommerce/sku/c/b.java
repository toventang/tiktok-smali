package com.ss.android.ugc.aweme.ecommerce.sku.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f87395a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(54884);
    }

    public static String a(List<String> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(list.get(i2));
            sb.append(", ");
        }
        sb.append((String) n.i((List) list));
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static String a(String[] strArr) {
        l.d(strArr, "");
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append("_");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return p.a(sb2, "__", "_");
    }

    public static String a(String[] strArr, List<SaleProp> list) {
        List<SalePropValue> list2;
        if (strArr == null || list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if ((!l.a((Object) strArr[i2], (Object) "")) && (list2 = list.get(i2).f87411d) != null) {
                for (T t : list2) {
                    if (p.a(t.f87412a, strArr[i2], false)) {
                        arrayList.add(t.f87413b);
                    }
                }
            }
        }
        return a(arrayList);
    }
}
