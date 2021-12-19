package com.ss.android.ugc.aweme.recommend.users.profile.powerlist;

import com.bytedance.covode.number.Covode;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f120138a = 1;

    static {
        Covode.recordClassIndex(78123);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f120138a == ((a) obj).f120138a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f120138a;
    }

    public final String toString() {
        return "RecommendPermissionItem(type=" + this.f120138a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }
}
