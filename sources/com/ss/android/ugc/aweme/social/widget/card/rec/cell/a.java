package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final User f133855a;

    static {
        Covode.recordClassIndex(87569);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f133855a, ((a) obj).f133855a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f133855a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendUserItem(user=" + this.f133855a + ")";
    }

    public a(User user) {
        l.d(user, "");
        this.f133855a = user;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        User user;
        l.d(aVar, "");
        String uid = this.f133855a.getUid();
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
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        User user;
        l.d(aVar, "");
        String uid = this.f133855a.getUid();
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
