package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import h.f.b.l;
import java.util.List;

public final class o extends a {

    /* renamed from: a  reason: collision with root package name */
    public final String f100296a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ah> f100297b;

    static {
        Covode.recordClassIndex(63943);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f100296a, oVar.f100296a) && l.a(this.f100297b, oVar.f100297b);
    }

    public final int hashCode() {
        String str = this.f100296a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<ah> list = this.f100297b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnLoadMemberEvent(conversationId=" + this.f100296a + ", list=" + this.f100297b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.im.core.d.ah> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, List<? extends ah> list) {
        super((byte) 0);
        l.d(str, "");
        l.d(list, "");
        this.f100296a = str;
        this.f100297b = list;
    }
}
