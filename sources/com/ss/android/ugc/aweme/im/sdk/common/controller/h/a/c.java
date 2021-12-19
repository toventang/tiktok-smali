package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;
import h.f.b.l;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f102301a;

    static {
        Covode.recordClassIndex(65465);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f102301a, ((c) obj).f102301a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102301a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "EnterChatEventKey(conversationId=" + this.f102301a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super("aweme_im_fetch_msg_list", str);
        l.d(str, "");
        this.f102301a = str;
    }
}
