package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.c.b;
import com.ss.android.ugc.aweme.im.service.c.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f102417a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(65565);
    }

    public static boolean a() {
        if (!b.a() || c.a()) {
            return false;
        }
        return true;
    }

    public static List<IMContact> a(List<IMContact> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof IMUser) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static List<String> b(List<? extends IMContact> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            arrayList.add(t.getUid());
        }
        return arrayList;
    }
}
