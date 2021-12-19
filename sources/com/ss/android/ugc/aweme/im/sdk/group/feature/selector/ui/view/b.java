package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final IMUser f102762a;

    static {
        Covode.recordClassIndex(65875);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public int hashCode() {
        return this.f102762a.hashCode();
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public b(IMUser iMUser) {
        l.d(iMUser, "");
        this.f102762a = iMUser;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return l.a((Object) this.f102762a.getUniqueId(), (Object) ((b) obj).f102762a.getUniqueId());
    }
}
