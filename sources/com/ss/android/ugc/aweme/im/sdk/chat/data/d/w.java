package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.an;
import h.f.b.l;

public final class w extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f100312a;

    /* renamed from: b  reason: collision with root package name */
    public final an f100313b;

    static {
        Covode.recordClassIndex(63951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f100312a == wVar.f100312a && l.a(this.f100313b, wVar.f100313b);
    }

    public final int hashCode() {
        int i2 = this.f100312a * 31;
        an anVar = this.f100313b;
        return i2 + (anVar != null ? anVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnSendModifyPropertyMsgEvent(statusCode=" + this.f100312a + ", modifyMsgPropertyMsg=" + this.f100313b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(int i2, an anVar) {
        super((byte) 0);
        l.d(anVar, "");
        this.f100312a = i2;
        this.f100313b = anVar;
    }
}
