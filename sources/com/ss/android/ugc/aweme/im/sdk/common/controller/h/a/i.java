package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;
import h.f.b.l;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f102313a;

    static {
        Covode.recordClassIndex(65471);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f102313a, ((i) obj).f102313a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102313a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "LoadConversationsEventKey(userId=" + this.f102313a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super("aweme_im_load_conversations", str);
        l.d(str, "");
        this.f102313a = str;
    }
}
