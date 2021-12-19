package com.ss.android.ugc.aweme.profile.assem.powercell;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f116041a;

    static {
        Covode.recordClassIndex(74857);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f116041a, ((a) obj).f116041a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f116041a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MyVideoItem(data=" + this.f116041a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    public a(Aweme aweme) {
        l.d(aweme, "");
        this.f116041a = aweme;
    }
}
