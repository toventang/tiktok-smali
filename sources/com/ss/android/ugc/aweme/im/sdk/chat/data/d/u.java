package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;

public final class u extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ai f100307a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f100308b;

    static {
        Covode.recordClassIndex(63949);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.f100307a, uVar.f100307a) && this.f100308b == uVar.f100308b;
    }

    public final int hashCode() {
        ai aiVar = this.f100307a;
        int hashCode = (aiVar != null ? aiVar.hashCode() : 0) * 31;
        boolean z = this.f100308b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "OnSendMessageAsyncRespEvent(message=" + this.f100307a + ", hasChanged=" + this.f100308b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(ai aiVar, boolean z) {
        super((byte) 0);
        l.d(aiVar, "");
        this.f100307a = aiVar;
        this.f100308b = z;
    }
}
