package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.c.a;
import com.bytedance.ies.abmock.datacenter.c.b;
import com.bytedance.ies.abmock.datacenter.e;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f31797a;

    static {
        Covode.recordClassIndex(18591);
        ArrayList arrayList = new ArrayList();
        f31797a = arrayList;
        arrayList.add("detail_cover_decode_config");
        f31797a.add("enable_add_poi_compliance");
        f31797a.add("poi_config");
    }

    public static void a() {
        for (String str : f31797a) {
            e.a().a(str);
            e.a().a(str);
            a.f31807a.c(str);
            b.f31810a.c(str);
        }
    }
}
