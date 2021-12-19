package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import h.f.b.l;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f100287a;

    static {
        Covode.recordClassIndex(63938);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f100287a, ((j) obj).f100287a);
        }
        return true;
    }

    public final int hashCode() {
        h hVar = this.f100287a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnDeleteConversationEvent(conversation=" + this.f100287a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super((byte) 0);
        l.d(hVar, "");
        this.f100287a = hVar;
    }
}
