package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f133856a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f133857b = true;

    static {
        Covode.recordClassIndex(87570);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f133856a, bVar.f133856a) && this.f133857b == bVar.f133857b;
    }

    public final int hashCode() {
        User user = this.f133856a;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        boolean z = this.f133857b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "SelectRecUserItem(user=" + this.f133856a + ", select=" + this.f133857b + ")";
    }

    public b(User user) {
        l.d(user, "");
        this.f133856a = user;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        User user;
        l.d(aVar, "");
        String uid = this.f133856a.getUid();
        String str = null;
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar2 = (a) aVar;
        if (!(aVar2 == null || (user = aVar2.f133855a) == null)) {
            str = user.getUid();
        }
        return l.a((Object) uid, (Object) str);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        User user;
        l.d(aVar, "");
        String uid = this.f133856a.getUid();
        String str = null;
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar2 = (a) aVar;
        if (!(aVar2 == null || (user = aVar2.f133855a) == null)) {
            str = user.getUid();
        }
        return l.a((Object) uid, (Object) str);
    }
}
