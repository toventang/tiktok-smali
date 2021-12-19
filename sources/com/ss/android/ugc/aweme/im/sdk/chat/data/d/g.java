package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public final String f100283a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f100284b = true;

    static {
        Covode.recordClassIndex(63935);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f100283a, gVar.f100283a) && this.f100284b == gVar.f100284b;
    }

    public final int hashCode() {
        String str = this.f100283a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f100284b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "OnClearMessageEvent(conversationId=" + this.f100283a + ", needNotify=" + this.f100284b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super((byte) 0);
        l.d(str, "");
        this.f100283a = str;
    }
}
