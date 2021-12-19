package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import h.f.b.l;
import java.util.List;

public final class aa extends a {

    /* renamed from: a  reason: collision with root package name */
    public final List<ah> f100260a;

    static {
        Covode.recordClassIndex(63917);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aa) && l.a(this.f100260a, ((aa) obj).f100260a);
        }
        return true;
    }

    public final int hashCode() {
        List<ah> list = this.f100260a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnUpdateMembersEvent(list=" + this.f100260a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.im.core.d.ah> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aa(List<? extends ah> list) {
        super((byte) 0);
        l.d(list, "");
        this.f100260a = list;
    }
}
