package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionalInfoItem;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetails;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(54151);
    }

    public static final class a extends com.google.gson.b.a<List<? extends ProductDetails>> {
        static {
            Covode.recordClassIndex(54152);
        }

        a() {
        }
    }

    public static final List<Object> a(ProductPackStruct productPackStruct, boolean z) {
        Iterable<ProductDetails> iterable;
        String str;
        l.d(productPackStruct, "");
        try {
            f fVar = new f();
            ProductBase productBase = productPackStruct.f86641e;
            if (productBase == null || (str = productBase.f86624b) == null) {
                str = "{}";
            }
            Object a2 = fVar.a(str, new a().type);
            l.b(a2, "");
            iterable = (List) a2;
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.a((Throwable) e2);
            iterable = z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ProductBase productBase2 = productPackStruct.f86641e;
        if ((productBase2 != null ? productBase2.f86625c : null) != null) {
            arrayList.add(new n(productPackStruct.f86641e.f86625c));
        }
        for (ProductDetails productDetails : iterable) {
            String str2 = productDetails.f86633a;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != 3735) {
                    if (hashCode != 3556653) {
                        if (hashCode != 100313435) {
                            if (hashCode == 110371416) {
                                if (!str2.equals("title")) {
                                }
                            }
                        } else if (str2.equals("image")) {
                            Image image = productDetails.f86634b;
                            if ((image != null ? image.getUrls() : null) != null) {
                                arrayList.add(new f(productDetails.f86634b));
                            }
                        }
                    } else if (!str2.equals("text")) {
                    }
                    if (productDetails.f86635c != null) {
                        arrayList.add(new m(productDetails.f86635c, productDetails.f86633a));
                    }
                } else if (str2.equals("ul") && productDetails.f86636d != null) {
                    List<String> list = productDetails.f86636d;
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new m(it.next(), "ul"));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        if (z && (!arrayList.isEmpty())) {
            String string = d.a().getString(R.string.bg_);
            l.b(string, "");
            arrayList.add(0, new m(string, "title"));
        }
        if (productPackStruct.f86646j != null && (!productPackStruct.f86646j.isEmpty())) {
            for (T t : productPackStruct.f86646j) {
                arrayList.add(new m(t.f86595b, "title"));
                List<AdditionalInfoItem> list2 = t.f86596c;
                if (list2 != null) {
                    for (T t2 : list2) {
                        arrayList.add(new m(com.ss.android.ugc.aweme.ecommerce.util.n.a(t2.f86597a + t2.f86598b, new com.ss.android.ugc.aweme.ecommerce.util.e(t2.f86597a, R.color.bx, (byte) 0), new com.ss.android.ugc.aweme.ecommerce.util.e(t2.f86598b, R.color.c4, (byte) 0)), "text"));
                    }
                }
            }
        }
        return arrayList;
    }
}
