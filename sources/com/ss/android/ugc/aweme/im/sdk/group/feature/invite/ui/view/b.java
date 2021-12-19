package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f102686a;

    static {
        Covode.recordClassIndex(65753);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f102686a, ((b) obj).f102686a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102686a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GroupInfoItem(conversationId=" + this.f102686a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public b(String str) {
        l.d(str, "");
        this.f102686a = str;
    }
}
