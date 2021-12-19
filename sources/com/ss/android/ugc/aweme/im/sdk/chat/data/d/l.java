package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ar;
import java.util.List;

public final class l extends c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ai> f100289a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100290b;

    /* renamed from: c  reason: collision with root package name */
    public final ar f100291c;

    static {
        Covode.recordClassIndex(63940);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f100289a, lVar.f100289a) && this.f100290b == lVar.f100290b && h.f.b.l.a(this.f100291c, lVar.f100291c);
    }

    public final int hashCode() {
        List<ai> list = this.f100289a;
        int i2 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f100290b) * 31;
        ar arVar = this.f100291c;
        if (arVar != null) {
            i2 = arVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnGetMessageEvent(list=" + this.f100289a + ", msgSource=" + this.f100290b + ", extra=" + this.f100291c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(List<ai> list, int i2, ar arVar) {
        super((byte) 0);
        h.f.b.l.d(list, "");
        h.f.b.l.d(arVar, "");
        this.f100289a = list;
        this.f100290b = i2;
        this.f100291c = arVar;
    }
}
