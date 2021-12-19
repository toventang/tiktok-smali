package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import h.f.b.l;
import java.util.List;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public final List<ah> f100280a;

    static {
        Covode.recordClassIndex(63933);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f100280a, ((e) obj).f100280a);
        }
        return true;
    }

    public final int hashCode() {
        List<ah> list = this.f100280a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnAddMembersEvent(list=" + this.f100280a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.im.core.d.ah> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(List<? extends ah> list) {
        super((byte) 0);
        l.d(list, "");
        this.f100280a = list;
    }
}
