package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;

public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ai> f100298a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f100299b;

    static {
        Covode.recordClassIndex(63944);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.f100298a, pVar.f100298a) && this.f100299b == pVar.f100299b;
    }

    public final int hashCode() {
        List<ai> list = this.f100298a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f100299b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "OnLoadNewerEvent(list=" + this.f100298a + ", success=" + this.f100299b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(List<ai> list, boolean z) {
        super((byte) 0);
        l.d(list, "");
        this.f100298a = list;
        this.f100299b = z;
    }
}
