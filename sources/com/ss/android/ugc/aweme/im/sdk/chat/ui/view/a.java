package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<z> f101264a;

    /* renamed from: b  reason: collision with root package name */
    public final b<com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, z> f101265b;

    static {
        Covode.recordClassIndex(64777);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f101264a, aVar.f101264a) && l.a(this.f101265b, aVar.f101265b);
    }

    public final int hashCode() {
        h.f.a.a<z> aVar = this.f101264a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b<com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, z> bVar = this.f101265b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ChatRiskHintAction(onDelete=" + this.f101264a + ", onCheckBottomType=" + this.f101265b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(h.f.a.a<z> aVar, b<? super com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, z> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        this.f101264a = aVar;
        this.f101265b = bVar;
    }
}
