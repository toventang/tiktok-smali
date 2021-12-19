package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import h.f.b.l;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f100288a;

    static {
        Covode.recordClassIndex(63939);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f100288a, ((k) obj).f100288a);
        }
        return true;
    }

    public final int hashCode() {
        h hVar = this.f100288a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnDissolvedConversationEvent(conversation=" + this.f100288a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(h hVar) {
        super((byte) 0);
        l.d(hVar, "");
        this.f100288a = hVar;
    }
}
