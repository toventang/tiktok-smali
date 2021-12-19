package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class ag implements m {

    /* renamed from: a  reason: collision with root package name */
    public final List<EmoteModel> f15083a;

    /* renamed from: b  reason: collision with root package name */
    private final m.a f15084b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f15085c;

    static {
        Covode.recordClassIndex(8373);
    }

    public final int hashCode() {
        int i2;
        int i3;
        List<EmoteModel> list = this.f15083a;
        int i4 = 0;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        m.a aVar = this.f15084b;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        Map<String, Object> map = this.f15085c;
        if (map != null) {
            i4 = map.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        return "SendEmoteEvent(emotes=" + this.f15083a + ", sender=" + this.f15084b + ", args=" + this.f15085c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (!l.a(this.f15083a, agVar.f15083a) || !l.a(this.f15084b, agVar.f15084b) || !l.a(this.f15085c, agVar.f15085c)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.emoji.EmoteModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public ag(List<? extends EmoteModel> list, m.a aVar, Map<String, ? extends Object> map) {
        l.d(list, "");
        l.d(aVar, "");
        l.d(map, "");
        this.f15083a = list;
        this.f15084b = aVar;
        this.f15085c = map;
    }
}
