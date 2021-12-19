package com.ss.android.ugc.aweme.search.l.a.a;

import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f121307a = new HashMap<>();

    static {
        Covode.recordClassIndex(79066);
    }

    public final void a(String str, Object obj) {
        l.d(str, "");
        l.d(obj, "");
        this.f121307a.put(str, obj);
        c.a(1, "SearchChainEventTracker", "key = " + str + ", value = " + obj);
    }
}
