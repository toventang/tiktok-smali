package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ay;
import h.f.b.l;

public final class v extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f100309a;

    /* renamed from: b  reason: collision with root package name */
    public final ai f100310b;

    /* renamed from: c  reason: collision with root package name */
    public final ay f100311c;

    static {
        Covode.recordClassIndex(63950);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f100309a == vVar.f100309a && l.a(this.f100310b, vVar.f100310b) && l.a(this.f100311c, vVar.f100311c);
    }

    public final int hashCode() {
        int i2 = this.f100309a * 31;
        ai aiVar = this.f100310b;
        int i3 = 0;
        int hashCode = (i2 + (aiVar != null ? aiVar.hashCode() : 0)) * 31;
        ay ayVar = this.f100311c;
        if (ayVar != null) {
            i3 = ayVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "OnSendMessageEvent(statusCode=" + this.f100309a + ", message=" + this.f100310b + ", metrics=" + this.f100311c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(int i2, ai aiVar, ay ayVar) {
        super((byte) 0);
        l.d(aiVar, "");
        this.f100309a = i2;
        this.f100310b = aiVar;
        this.f100311c = ayVar;
    }
}
