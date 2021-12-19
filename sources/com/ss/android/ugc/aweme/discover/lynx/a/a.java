package com.ss.android.ugc.aweme.discover.lynx.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final List<g.a<?>> f81409a = new ArrayList();

    static {
        Covode.recordClassIndex(50597);
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.g
    public final void a(Object obj) {
        l.d(obj, "");
        for (g.a<?> aVar : this.f81409a) {
            l.a(aVar.a(), obj.getClass());
        }
    }
}
