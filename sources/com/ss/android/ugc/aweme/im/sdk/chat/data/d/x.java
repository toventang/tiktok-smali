package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class x extends a {

    /* renamed from: a  reason: collision with root package name */
    public final String f100314a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100315b;

    static {
        Covode.recordClassIndex(63952);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return l.a(this.f100314a, xVar.f100314a) && this.f100315b == xVar.f100315b;
    }

    public final int hashCode() {
        String str = this.f100314a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f100315b;
    }

    public final String toString() {
        return "OnSilentConversationEvent(conversationId=" + this.f100314a + ", status=" + this.f100315b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str, int i2) {
        super((byte) 0);
        l.d(str, "");
        this.f100314a = str;
        this.f100315b = i2;
    }
}
