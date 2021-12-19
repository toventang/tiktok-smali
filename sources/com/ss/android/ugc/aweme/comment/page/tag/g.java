package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final IMUser f72258a;

    static {
        Covode.recordClassIndex(44545);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public int hashCode() {
        return this.f72258a.hashCode();
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public g(IMUser iMUser) {
        l.d(iMUser, "");
        this.f72258a = iMUser;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return l.a((Object) this.f72258a.getUniqueId(), (Object) ((g) obj).f72258a.getUniqueId());
    }
}
