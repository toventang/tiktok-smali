package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.feed.u.d;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public int f95145a;

    /* renamed from: b  reason: collision with root package name */
    private b<d> f95146b;

    static {
        Covode.recordClassIndex(60304);
    }

    public final boolean a() {
        int i2 = this.f95145a;
        a aVar = (a) this.f95146b.f76396h;
        l.b(aVar, "");
        if (i2 >= aVar.getItems().size() - 1 || com.ss.android.ugc.aweme.compliance.api.a.f().b()) {
            return false;
        }
        return true;
    }

    public v(b<d> bVar) {
        l.d(bVar, "");
        this.f95146b = bVar;
        ((d) bVar.f76396h).f94005d = this;
    }
}
