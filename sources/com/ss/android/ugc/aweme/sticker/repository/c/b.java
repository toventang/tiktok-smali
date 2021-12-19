package com.ss.android.ugc.aweme.sticker.repository.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<Effect> f135481a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135482b;

    /* renamed from: c  reason: collision with root package name */
    public final int f135483c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f135484d;

    static {
        Covode.recordClassIndex(88544);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f135481a, bVar.f135481a) && this.f135482b == bVar.f135482b && this.f135483c == bVar.f135483c && l.a(this.f135484d, bVar.f135484d);
    }

    public final int hashCode() {
        List<Effect> list = this.f135481a;
        int i2 = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f135482b) * 31) + this.f135483c) * 31;
        Map<String, String> map = this.f135484d;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PinStickerRequest(effects=" + this.f135481a + ", pinIndex=" + this.f135482b + ", priority=" + this.f135483c + ", extraParam=" + this.f135484d + ")";
    }

    public /* synthetic */ b(List list, int i2) {
        this(list, i2, 0, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends Effect> list, int i2, int i3, Map<String, String> map) {
        l.d(list, "");
        this.f135481a = list;
        this.f135482b = i2;
        this.f135483c = i3;
        this.f135484d = map;
    }
}
