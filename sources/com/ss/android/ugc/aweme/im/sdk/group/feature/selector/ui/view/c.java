package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final IMConversation f102763a;

    static {
        Covode.recordClassIndex(65876);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f102763a, ((c) obj).f102763a);
        }
        return true;
    }

    public final int hashCode() {
        IMConversation iMConversation = this.f102763a;
        if (iMConversation != null) {
            return iMConversation.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GroupListItem(contact=" + this.f102763a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public c(IMConversation iMConversation) {
        l.d(iMConversation, "");
        this.f102763a = iMConversation;
    }
}
