package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;

public final class s extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ai f100305a;

    static {
        Covode.recordClassIndex(63947);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof s) && l.a(this.f100305a, ((s) obj).f100305a);
        }
        return true;
    }

    public final int hashCode() {
        ai aiVar = this.f100305a;
        if (aiVar != null) {
            return aiVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnRecallMessageEvent(message=" + this.f100305a + ")";
    }
}
