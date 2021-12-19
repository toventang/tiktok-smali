package com.bytedance.helios.sdk.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.sdk.f.e.a;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30965a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final List<a> f30966b = n.c(a.f30982d);

    private b() {
    }

    static {
        Covode.recordClassIndex(17965);
    }

    public static final void a(RuleInfo ruleInfo) {
        l.c(ruleInfo, "");
        Iterator<T> it = f30966b.iterator();
        while (it.hasNext()) {
            it.next().a(ruleInfo);
        }
    }

    public static final void a(String str, boolean z) {
        l.c(str, "");
        Iterator<T> it = f30966b.iterator();
        while (it.hasNext()) {
            it.next().a(str, z);
        }
    }
}
