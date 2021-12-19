package com.ss.android.ugc.aweme.ecommerce.sku.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87394a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(54883);
    }

    public static SkuItem a(String str, List<SkuItem> list) {
        T t;
        l.d(str, "");
        l.d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (p.a(t.getSalePropValueIds(), str, false)) {
                break;
            }
        }
        return t;
    }

    public static int a(String[] strArr, List<SkuItem> list) {
        l.d(strArr, "");
        l.d(list, "");
        int length = strArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (!l.a((Object) strArr[i3], (Object) "")) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    List<SkuSaleProp> skuSalePropList = t2.getSkuSalePropList();
                    if (skuSalePropList != null && !skuSalePropList.isEmpty() && a(t2.getSkuSalePropList(), strArr[i3])) {
                        arrayList.add(t);
                    }
                }
                list = arrayList;
            }
        }
        for (SkuItem skuItem : list) {
            if (skuItem.getStockNum() != null) {
                i2 += skuItem.getStockNum().intValue();
            }
        }
        return i2;
    }

    private static boolean a(List<SkuSaleProp> list, String str) {
        l.d(list, "");
        l.d(str, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().f87418b, (Object) str)) {
                return true;
            }
        }
        return false;
    }
}
