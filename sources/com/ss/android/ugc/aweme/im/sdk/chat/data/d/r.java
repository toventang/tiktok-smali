package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;

public final class r extends c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ai> f100302a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100303b;

    /* renamed from: c  reason: collision with root package name */
    public final String f100304c;

    static {
        Covode.recordClassIndex(63946);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f100302a, rVar.f100302a) && this.f100303b == rVar.f100303b && l.a(this.f100304c, rVar.f100304c);
    }

    public final int hashCode() {
        List<ai> list = this.f100302a;
        int i2 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f100303b) * 31;
        String str = this.f100304c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnQueryMessageEvent(list=" + this.f100302a + ", direction=" + this.f100303b + ", from=" + this.f100304c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(List<ai> list, int i2, String str) {
        super((byte) 0);
        l.d(list, "");
        this.f100302a = list;
        this.f100303b = i2;
        this.f100304c = str;
    }
}
