package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import h.f.b.l;

public final class z extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f100319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100320b;

    static {
        Covode.recordClassIndex(63954);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return l.a(this.f100319a, zVar.f100319a) && this.f100320b == zVar.f100320b;
    }

    public final int hashCode() {
        h hVar = this.f100319a;
        return ((hVar != null ? hVar.hashCode() : 0) * 31) + this.f100320b;
    }

    public final String toString() {
        return "OnUpdateConversationEvent(conversation=" + this.f100319a + ", reason=" + this.f100320b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(h hVar, int i2) {
        super((byte) 0);
        l.d(hVar, "");
        this.f100319a = hVar;
        this.f100320b = i2;
    }
}
