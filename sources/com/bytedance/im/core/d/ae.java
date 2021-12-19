package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.d.b.d;
import com.bytedance.im.core.internal.d.c;
import java.util.ArrayList;
import java.util.List;

public class ae {

    /* renamed from: a  reason: collision with root package name */
    private List<Long> f37693a = new ArrayList();

    static {
        Covode.recordClassIndex(22659);
    }

    public void a() {
        c a2 = c.a();
        List<Long> list = this.f37693a;
        for (d dVar : a2.f38714a) {
            dVar.a().a(list);
        }
        this.f37693a.clear();
    }
}
