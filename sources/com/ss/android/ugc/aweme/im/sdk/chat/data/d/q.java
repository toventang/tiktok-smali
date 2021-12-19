package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;

public final class q extends c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ai> f100300a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f100301b;

    static {
        Covode.recordClassIndex(63945);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f100300a, qVar.f100300a) && this.f100301b == qVar.f100301b;
    }

    public final int hashCode() {
        List<ai> list = this.f100300a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f100301b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "OnLoadOlderEvent(list=" + this.f100300a + ", success=" + this.f100301b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(List<ai> list, boolean z) {
        super((byte) 0);
        l.d(list, "");
        this.f100300a = list;
        this.f100301b = z;
    }
}
