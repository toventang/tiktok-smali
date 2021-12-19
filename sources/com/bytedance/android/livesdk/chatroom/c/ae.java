package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class ae implements m {

    /* renamed from: a  reason: collision with root package name */
    public final String f15078a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f15079b;

    /* renamed from: c  reason: collision with root package name */
    private final m.a f15080c;

    static {
        Covode.recordClassIndex(8371);
    }

    public final int hashCode() {
        int i2;
        int i3;
        String str = this.f15078a;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        m.a aVar = this.f15080c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        Map<String, Object> map = this.f15079b;
        if (map != null) {
            i4 = map.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        return "SendBarrageEvent(content=" + this.f15078a + ", sender=" + this.f15080c + ", args=" + this.f15079b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        if (!l.a((Object) this.f15078a, (Object) aeVar.f15078a) || !l.a(this.f15080c, aeVar.f15080c) || !l.a(this.f15079b, aeVar.f15079b)) {
            return false;
        }
        return true;
    }

    public ae(String str, m.a aVar, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(map, "");
        this.f15078a = str;
        this.f15080c = aVar;
        this.f15079b = map;
    }
}
