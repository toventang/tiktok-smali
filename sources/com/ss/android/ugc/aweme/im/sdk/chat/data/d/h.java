package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.im.core.d.h f100285a;

    static {
        Covode.recordClassIndex(63936);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f100285a, ((h) obj).f100285a);
        }
        return true;
    }

    public final int hashCode() {
        com.bytedance.im.core.d.h hVar = this.f100285a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnCreateConversationEvent(conversation=" + this.f100285a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.bytedance.im.core.d.h hVar) {
        super((byte) 0);
        l.d(hVar, "");
        this.f100285a = hVar;
    }
}
