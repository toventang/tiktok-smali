package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final f f72237a;

    static {
        Covode.recordClassIndex(44528);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f72237a, ((c) obj).f72237a);
        }
        return true;
    }

    public final int hashCode() {
        f fVar = this.f72237a;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FeedTaggedEditItem(param=" + this.f72237a + ")";
    }

    public c(f fVar) {
        this.f72237a = fVar;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }
}
