package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class y extends a {

    /* renamed from: a  reason: collision with root package name */
    public final String f100316a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100317b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Long> f100318c;

    static {
        Covode.recordClassIndex(63953);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return l.a(this.f100316a, yVar.f100316a) && this.f100317b == yVar.f100317b && l.a(this.f100318c, yVar.f100318c);
    }

    public final int hashCode() {
        String str = this.f100316a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f100317b) * 31;
        List<Long> list = this.f100318c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnSilentMemberEvent(conversationId=" + this.f100316a + ", status=" + this.f100317b + ", silentMembers=" + this.f100318c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(String str, int i2, List<Long> list) {
        super((byte) 0);
        l.d(str, "");
        l.d(list, "");
        this.f100316a = str;
        this.f100317b = i2;
        this.f100318c = list;
    }
}
