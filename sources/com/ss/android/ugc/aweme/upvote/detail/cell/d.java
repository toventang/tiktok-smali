package com.ss.android.ugc.aweme.upvote.detail.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.event.b;
import h.f.b.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h f142129a;

    /* renamed from: b  reason: collision with root package name */
    public final b f142130b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f142131c;

    static {
        Covode.recordClassIndex(92900);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f142129a, dVar.f142129a) && l.a(this.f142130b, dVar.f142130b) && this.f142131c == dVar.f142131c;
    }

    public final int hashCode() {
        h hVar = this.f142129a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        b bVar = this.f142130b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f142131c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "UpvoteDetailPanelListItem(upvote=" + this.f142129a + ", detailMobParam=" + this.f142130b + ", needHighlight=" + this.f142131c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof d)) {
            return false;
        }
        return l.a((Object) this.f142129a.getCommentId(), (Object) ((d) aVar).f142129a.getCommentId());
    }

    public d(h hVar, b bVar, boolean z) {
        l.d(hVar, "");
        this.f142129a = hVar;
        this.f142130b = bVar;
        this.f142131c = z;
    }
}
