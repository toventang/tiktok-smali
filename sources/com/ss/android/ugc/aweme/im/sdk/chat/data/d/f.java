package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;

public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f100281a;

    /* renamed from: b  reason: collision with root package name */
    public final ai f100282b;

    static {
        Covode.recordClassIndex(63934);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f100281a == fVar.f100281a && l.a(this.f100282b, fVar.f100282b);
    }

    public final int hashCode() {
        int i2 = this.f100281a * 31;
        ai aiVar = this.f100282b;
        return i2 + (aiVar != null ? aiVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnAddMessageEvent(statusCode=" + this.f100281a + ", message=" + this.f100282b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i2, ai aiVar) {
        super((byte) 0);
        l.d(aiVar, "");
        this.f100281a = i2;
        this.f100282b = aiVar;
    }
}
