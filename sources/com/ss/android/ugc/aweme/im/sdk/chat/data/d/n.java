package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import h.f.b.l;

public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f100295a;

    static {
        Covode.recordClassIndex(63942);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && l.a(this.f100295a, ((n) obj).f100295a);
        }
        return true;
    }

    public final int hashCode() {
        h hVar = this.f100295a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnLeaveConversationEvent(conversation=" + this.f100295a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(h hVar) {
        super((byte) 0);
        l.d(hVar, "");
        this.f100295a = hVar;
    }
}
