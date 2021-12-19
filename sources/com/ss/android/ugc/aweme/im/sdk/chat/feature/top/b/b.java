package com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final SystemContent f101079a;

    /* renamed from: b  reason: collision with root package name */
    public final String f101080b;

    static {
        Covode.recordClassIndex(64667);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f101079a, bVar.f101079a) && l.a(this.f101080b, bVar.f101080b);
    }

    public final int hashCode() {
        SystemContent systemContent = this.f101079a;
        int i2 = 0;
        int hashCode = (systemContent != null ? systemContent.hashCode() : 0) * 31;
        String str = this.f101080b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShowChatTopTipEvent(content=" + this.f101079a + ", conversationId=" + this.f101080b + ")";
    }

    public b(SystemContent systemContent, String str) {
        l.d(systemContent, "");
        this.f101079a = systemContent;
        this.f101080b = str;
    }
}
