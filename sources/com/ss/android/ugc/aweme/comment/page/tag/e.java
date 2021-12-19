package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f72254a;

    /* renamed from: b  reason: collision with root package name */
    public final f f72255b;

    static {
        Covode.recordClassIndex(44543);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f72254a, eVar.f72254a) && l.a(this.f72255b, eVar.f72255b);
    }

    public final int hashCode() {
        User user = this.f72254a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        f fVar = this.f72255b;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FeedTaggedListItem(user=" + this.f72254a + ", param=" + this.f72255b + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public e(User user, f fVar) {
        l.d(user, "");
        this.f72254a = user;
        this.f72255b = fVar;
    }
}
