package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;

public final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ai f100286a;

    static {
        Covode.recordClassIndex(63937);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f100286a, ((i) obj).f100286a);
        }
        return true;
    }

    public final int hashCode() {
        ai aiVar = this.f100286a;
        if (aiVar != null) {
            return aiVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnDelMessageEvent(message=" + this.f100286a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ai aiVar) {
        super((byte) 0);
        l.d(aiVar, "");
        this.f100286a = aiVar;
    }
}
