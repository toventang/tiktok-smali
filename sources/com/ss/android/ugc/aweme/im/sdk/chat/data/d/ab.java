package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class ab extends c {

    /* renamed from: a  reason: collision with root package name */
    public final List<ai> f100261a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Map<String, String>> f100262b;

    static {
        Covode.recordClassIndex(63918);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return l.a(this.f100261a, abVar.f100261a) && l.a(this.f100262b, abVar.f100262b);
    }

    public final int hashCode() {
        List<ai> list = this.f100261a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map<String, Map<String, String>> map = this.f100262b;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnUpdateMessageEvent(list=" + this.f100261a + ", oldMsgExtMap=" + this.f100262b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab(List<ai> list, Map<String, ? extends Map<String, String>> map) {
        super((byte) 0);
        l.d(list, "");
        l.d(map, "");
        this.f100261a = list;
        this.f100262b = map;
    }
}
